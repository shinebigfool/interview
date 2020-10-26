package com.company;

import java.lang.reflect.Constructor;

public class Constructors {
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("com.company.Student");
        System.out.println("所有公共构造方法如下");
        Constructor[] conArry = clazz.getConstructors();
        for(Constructor c:conArry){
            System.out.println(c);
        }
        System.out.println("所有的构造方法如下");
        conArry = clazz.getDeclaredConstructors();
        for(Constructor c:conArry){
            System.out.println(c);
        }
        System.out.println("获取公有、无参的构造方法");
        Constructor con = clazz.getConstructor(null);
        System.out.println(con);
        Object obj = con.newInstance();
        System.out.println("获取私有构造方法，并调用");
        con = clazz.getDeclaredConstructor(char.class);
        System.out.println(con);
        con.setAccessible(true);
        obj = con.newInstance('男');
    }
}
