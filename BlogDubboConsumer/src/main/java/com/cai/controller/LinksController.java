package com.cai.controller;

import com.cai.annotation.SystemLog;
import com.cai.model.Links;
import com.cai.service.LinksService;
import com.cai.util.ConstantUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class LinksController {

	@Resource(name = "linksService")
	private LinksService linksService;
	 
	 /**
	  * 查询所有已上架的友链
	  * @return 前台
	  * @throws Exception
	  */
	 @RequestMapping(value = "/selectAllLinks",method=RequestMethod.GET)
	 @ResponseBody
	 public Map<String, Object> selectAllLinks() throws Exception{
		 List<Links> linksList=linksService.selectAllLinks();
		 
		 Map<String, Object> returnMap=new HashMap<String, Object>();
		 if(linksList.size()>0){
			 returnMap.put("status", 200);
		 }else{
			 //500表示：返回值为Null
			 returnMap.put("status", 500);
		 }
		 returnMap.put("linksList", linksList);
		 return returnMap;
	 }
	 
	 /**
	  * 实现申请友链功能
	  * @param resource
	  * @return
	  * @throws Exception
	  */
	 @RequestMapping(value = "/addLinks",method = RequestMethod.POST)
	 @ResponseBody
	 @SystemLog(description = ConstantUtil.LINKS_ADD,userType=ConstantUtil.USERTYPE_USER)
	 public Map<String, Object> addLinks(String prarm,Links links) throws Exception{
		 Map<String, Object> map=new HashMap<String, Object>();
		 links.setAddtime(new Date());
		 if(linksService.insert(links)!=0){
			 map.put("status", 200);
		}else{
			 //0表示：插入失败
			 map.put("status", 0);
		 }
		 return map;
	 }
	 
	 
	 /**
	  * 按博客id查询资源信息
	  * @param id
	  * @return
	  * @throws Exception
	  */
	 @RequestMapping(value = "/selectLinksById",method = RequestMethod.POST)
	 @ResponseBody
	 public Map<String, Object> selectLinksById(Integer id) throws Exception{
		 Map<String, Object> map=new HashMap<String, Object>();
		 Links links=linksService.selectByPrimaryKey(id);
		 if(links!=null){
			 map.put("status", 200);
		 }else{
			 //500表示：返回值为Null
			 map.put("status", 500);
		 }
		 return map;
	 }
	 
}
