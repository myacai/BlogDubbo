package com.cai.model;

import java.io.Serializable;

public class A  implements Serializable {
    static {
        System.out.println("A static");
    }

     {
        System.out.println("A fei");
    }


    A (){
        System.out.println("A gou");
    }

    A (int a){
        System.out.println("A gou");
    }
}
