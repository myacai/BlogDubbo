package com.cai;

import com.cai.model.Blog;
import com.cai.service.impl.BlogServiceImpl;

public class Test {
    public static void main(String[] args) {
        BlogServiceImpl service = new BlogServiceImpl();
        Blog blog = service.selectBlogById(105);
        System.out.println(blog.getTitle());
    }
}
