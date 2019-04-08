package com.cai.annotation;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD})    
@Retention(RetentionPolicy.RUNTIME)    
@Documented    
public  @interface SystemLog {    
    
    String description()  default ""; 

    String userType()  default "管理员";
    /*
    enum userType{
        boos("老板"),
        emp("员工");

        private Integer money;

        userType(String 老板) {
        }

        private Integer toMoney(){
            return money;
        }
    }
    */
} 