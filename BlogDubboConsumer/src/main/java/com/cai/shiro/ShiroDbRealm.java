package com.cai.shiro;


import com.cai.model.Bloger;
import com.cai.service.BlogerService;
import com.cai.util.CipherUtil;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


public class ShiroDbRealm extends AuthorizingRealm {
	private static final String ALGORITHM = "MD5";

	@Resource(name = "blogerService")
	private BlogerService blogerService;

	public ShiroDbRealm() {
		super();
	}

	/**
	 * 验证登陆
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		System.out.println(token.getUsername());
		Bloger bloger = blogerService.findUserByLoginName(token.getUsername());

		//CipherUtil cipher = new CipherUtil();// MD5加密
		if (bloger != null) {
			/*
			return new SimpleAuthenticationInfo(bloger.getUsername(),
					cipher.generatePassword(bloger.getPassword()), getName());
					*/
			System.out.println(bloger.getUsername());
			return new SimpleAuthenticationInfo(bloger.getUsername(),
					bloger.getPassword(), getName());
		} else {
			throw new AuthenticationException();
		}
	}

	/**
	 * 登陆成功之后，进行角色和权限验证
	 */
	/*
	 * protected AuthorizationInfo doGetAuthorizationInfo1(PrincipalCollection
	 * principals) { 这里应该根据userName使用role和permission 的serive层来做判断，并将对应
	 * 的权限加进来，下面简化了这一步 Set<String> roleNames = new HashSet<String>();
	 * Set<String> permissions = new HashSet<String>();
	 * roleNames.add("admin");//添加角色。对应到index.jsp
	 * roleNames.add("administrator");
	 * permissions.add("create");//添加权限,对应到index.jsp
	 * permissions.add("login.do?main"); permissions.add("login.do?logout");
	 * SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleNames);
	 * info.setStringPermissions(permissions); return info; }
	 */

	/**
	 * 清除所有用户授权信息缓存.
	 */
	public void clearCachedAuthorizationInfo(String principal) {
		SimplePrincipalCollection principals = new SimplePrincipalCollection(
				principal, getName());
		clearCachedAuthorizationInfo(principals);
	}

	/**
	 * 清除所有用户授权信息缓存.
	 */
	public void clearAllCachedAuthorizationInfo() {
		Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
		if (cache != null) {
			for (Object key : cache.keys()) {
				cache.remove(key);
			}
		}
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	// @PostConstruct
	// public void initCredentialsMatcher() {//
	// HashedCredentialsMatcher matcher = new
	// HashedCredentialsMatcher(ALGORITHM);
	// setCredentialsMatcher(matcher);
	// }
}