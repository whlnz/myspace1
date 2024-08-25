package com.microsoft.demo;

import org.springframework.core.enums.LabeledEnum;

public class Demo {

    public void DoSomething(boolean flag){


        System.out.println(LabeledEnum.LABEL_ORDER);
        //log.debug();
        if(flag){
            System.out.println("I am covered");
            return;
        }



        System.out.println("I am not covered");
    }
}