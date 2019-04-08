package com.cai.model;

import java.io.Serializable;

public class B extends A  implements Serializable {
    static {
        System.out.println("B static");
    }

    {
        System.out.println("B fei");
    }

    B (){
        System.out.println("B gou");
    }

    B (int a){
        System.out.println("B gou");
    }
}
