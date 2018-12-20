package com.pankaj.kotlin.demos.com.myjava;

import com.pankaj.kotlin.demos.Kot;

public class MyJava {
    public static void main(String[] args){
        System.out.println(Kot.getKotlinValue());
        System.out.println(Kot.test(10,20));
    }

    public String getStringValue() {
        return "MyJava";
    }
}
