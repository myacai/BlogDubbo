package com.cai.controller;

import com.cai.model.BlogType;
import com.cai.service.BlogTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BlogTypeController {

	@Resource(name = "blogTypeService")
	private BlogTypeService blogTypeService;

	@RequestMapping(value = "/selectBlogType", method = RequestMethod.POST)
	@ResponseBody
	public List<BlogType> selectBlogType(
			@RequestParam(value = "data", required = false) String data)
			throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		if (data == "all") {
			map = null;
		}
		List<BlogType> typeList = blogTypeService.selectBlogTypeListByPage(map);

		return typeList;
	}
	
}
