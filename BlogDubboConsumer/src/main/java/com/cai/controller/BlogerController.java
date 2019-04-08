package com.cai.controller;

import com.cai.annotation.SystemLog;
import com.cai.model.Bloger;
import com.cai.model.CourseVideo;
import com.cai.model.CourseVideoList;
import com.cai.service.BlogerService;
import com.cai.service.CoursevideoService;
import com.cai.service.CoursevideolistService;
import com.cai.util.CipherUtil;
import com.cai.util.ConstantUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class BlogerController {

	@Resource(name = "blogerService")
	private BlogerService blogerService;

    @Resource(name = "coursevideolistService")
	private CoursevideolistService coursevideolistService;

    @Resource(name = "coursevideoService")
	private CoursevideoService coursevideoService;

    @RequestMapping("/remen")
    public String remen(HttpServletRequest request, HttpServletResponse response, Model model){

        return "index2";
    }


    @RequestMapping(value = "/courseVideo", method = RequestMethod.GET)
    public String courseVideo(HttpServletRequest request, HttpServletResponse response, Model model,
                              @RequestParam(value = "id")int id,@RequestParam(value = "v")int v){
        //System.out.println("id"+id);
        //System.out.println("v"+v);

        CourseVideoList courseVideoList = coursevideolistService.getByIndexCourseId(id,v);
        CourseVideo courseVideo = coursevideoService.getById(id);
        List<CourseVideoList> courseVideoLists = coursevideolistService.getByCourseId(id);
        for(int i=0;i<courseVideoLists.size();i++){
            System.out.println(courseVideoLists.get(i).getCatalog());
        }
        //String catalog = courseVideoList.getCatalog();
        //System.out.println(catalog);
        model.addAllAttributes(courseVideoLists);
        model.addAttribute(courseVideoList);
        model.addAttribute(courseVideo);
        return "page/courseVideo";
    }


    /**
     * 初始登陆界面 
     * @param request 
     * @return 
     */  
    @RequestMapping("/login")
    public String tologin(HttpServletRequest request, HttpServletResponse response, Model model){

    	return "login";
    }

    @RequestMapping("/rigister")
    public String toRigister(HttpServletRequest request, HttpServletResponse response, Model model){

        return "rigist";
    }

    /**
     * 注册用户名和密码
     * @param
     * @return
     */
    @RequestMapping("/checkRigister")
    @SystemLog(description = ConstantUtil.LOGIN_IN,userType=ConstantUtil.USERTYPE_ADMIN)
    public String Rigister(String username,HttpSession session,String password,String email,Model model) {
        String result = "";
        try {
            Bloger bloger = blogerService.findUserByLoginName(username);
            if(bloger == null){
                Bloger bloger1 = new Bloger(username,password,email);
                blogerService.insert(bloger);
                result = "login";
            }else{
                result = "rigister";//验证失败
                model.addAttribute("message", "用户名已经被注册");
            }
        } catch (Exception e) {
            result = "rigister";//验证失败
            model.addAttribute("message", "错误");
        }
        return result;
    }

    /** 
     * 验证用户名和密码 
     * @param
     * @return 
     */  
    @RequestMapping("/checkLogin")
    @SystemLog(description = ConstantUtil.LOGIN_IN,userType=ConstantUtil.USERTYPE_ADMIN)
    public String login(String username,HttpSession session,String password,Model model) {  
        String result = "";
        //MD5加密
        password = CipherUtil.generatePassword(password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject currentUser = SecurityUtils.getSubject();
        try {
            if (!currentUser.isAuthenticated()){            //shiro验证
                token.setRememberMe(true);               //记住密码
                    currentUser.login(token);               //验证角色和权限
            }
            result = "admin/index";             //验证成功
            session.setAttribute("username", username);
        } catch (Exception e) {
            result = "login";//验证失败
            model.addAttribute("message", "用户名或密码错误");
        }
        return result;  
    }  
    
    /** 
     * 退出 
     * @return 
     */  
    @RequestMapping(value = "/admin/logout")  
    @SystemLog(description = ConstantUtil.LOGIN_OUT,userType=ConstantUtil.USERTYPE_ADMIN)
    public String logout() {    
        Subject currentUser = SecurityUtils.getSubject();    
        String result = "login";    
        currentUser.logout();    
        return result;    
    } 
}
