package com.cai;

import java.io.IOException;

import com.cai.model.Blog;
import com.cai.service.impl.BlogServiceImpl;
import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	
	public static void main(String[] args) throws IOException {

		BasicConfigurator.configure();
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        //System.out.println("1");
		ioc.start();
        //System.out.println("2");
        //BlogServiceImpl blogService = new BlogServiceImpl();
        //Blog blog = blogService.selectBlogById(1);
        //System.out.println(blog.getTitle());
		System.in.read();


	}

}
