package com.cai.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NavController {
	
	 /** 
     * 初始登陆界面 
     * @param request 
     * @return 
     */  
    @RequestMapping("/{nav}")
    public String returnToJsp(@PathVariable String nav){  
    	String result="page/"+nav;
    	return result;  
    }  
    
    /** 
     * 初始登陆界面 
     * @param request 
     * @return 
     */  
    @RequestMapping(value="/result")
    public String searchResult(String keyboard,Model model){ 
      if(keyboard != null){
        model.addAttribute("keyword", keyboard);
      }
      return "/page/result";  
    }  
}
