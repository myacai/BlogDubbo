package com.cai.aop;

import com.cai.annotation.SystemLog;
import com.cai.model.Log;
import com.cai.service.LogService;
import com.cai.util.UserIpUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

@Aspect
@Component
public class SystemLogAspect {
	// 注入Service用于把日志保存数据库
	@Resource(name = "logService")
	private LogService logService;

	// Service层切点
	@Pointcut("@annotation(com.cai.annotation.SystemLog)")
	public void serviceAspect() {
	}

	@After("serviceAspect()")
	public void doServiceLog(JoinPoint joinPoint) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
		try {
			// 数据库日志
			Log log = new Log();
			// 获取日志描述信息
			
			log.setUserType(getUserType(joinPoint));
			log.setIp(UserIpUtil.getIp(request));
			log.setParam(joinPoint.getArgs()[0].toString());
			log.setDescription(getDescription(joinPoint));
			log.setAddtime(new Date());
			if(!log.getParam().equals("none")){
				logService.insert(log);
			}
			
		} catch (Exception e) {
		}
	}

	/**
	 * 获取注解中对方法的描述信息 用于service层注解
	 * 
	 * @param joinPoint
	 *            切点
	 * @return 方法描述
	 * @throws Exception
	 */
	public static String getDescription(JoinPoint joinPoint)
			throws Exception {
		String targetName = joinPoint.getTarget().getClass().getName();
		String methodName = joinPoint.getSignature().getName();
		Object[] arguments = joinPoint.getArgs();
		Class<?> targetClass = Class.forName(targetName);
		Method[] methods = targetClass.getMethods();
		String description = "";
		for (Method method : methods) {
			if (method.getName().equals(methodName)) {
				Class[] clazzs = method.getParameterTypes();
				if (clazzs.length == arguments.length) {
					description = method.getAnnotation(SystemLog.class)
							.description();
					break;
				}
			}
		}
		return description;
	}
	
	/**
	 * 获取注解中的用户信息 用于service层注解
	 * 
	 * @param joinPoint
	 *            切点
	 * @return 方法描述
	 * @throws Exception
	 */
	public static String getUserType(JoinPoint joinPoint)
			throws Exception {
		String targetName = joinPoint.getTarget().getClass().getName();
		String methodName = joinPoint.getSignature().getName();
		Object[] arguments = joinPoint.getArgs();
		Class<?> targetClass = Class.forName(targetName);
		Method[] methods = targetClass.getMethods();
		String userType = "";
		for (Method method : methods) {
			if (method.getName().equals(methodName)) {
				Class[] clazzs = method.getParameterTypes();
				if (clazzs.length == arguments.length) {
					userType = method.getAnnotation(SystemLog.class)
							.userType();
					break;
				}
			}
		}
		return userType;
	}
	
}
