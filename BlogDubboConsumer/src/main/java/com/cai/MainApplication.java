package com.cai;

import java.io.IOException;

import com.cai.model.Blog;
import com.cai.service.BlogService;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApplication {
	
	//@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

		BlogService blogService = applicationContext.getBean(BlogService.class);

		Blog blog = blogService.selectBlogById(1);
		System.out.println(blog.getContent());
		System.out.println("调用完成....");
		System.in.read();
	}

}
