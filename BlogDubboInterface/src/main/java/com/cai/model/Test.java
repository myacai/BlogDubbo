package com.cai.model;

public class Test {
    {
        System.out.println("1");
    }

    public static void main(String[] args) {

        String s = "\\Users\\Administrator\\Desktop\\码云SSM\\Art_Blog\\src\\main\\webapp\\images\\upload\\2019-03-24\\2019-03-24102087.JPG";
        s = s.replace("Desktop","a");
        System.out.println(s);
    }
}
