package com.interview.Singleton.test;

import com.interview.Singleton.Singleton1;
import com.interview.Singleton.Singleton3;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
    @Test
    public void test1(){
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        System.out.println(s1==s2);
    }
    @Test
    public void test2() throws IOException {
        for (int i=0;i<3;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton1.getInstance());
                }
            }).start();
        }
        int read = System.in.read();
    }
    @Test
    public void test3() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Singleton1.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = (Singleton1)constructor.newInstance();
        System.out.println(s1==s2);
    }
    @Test
    public void test4(){
        Singleton3 s1 = Singleton3.INSTANCE;
        Singleton3 s2 = Singleton3.INSTANCE;
        System.out.println(s1==s2);
    }
}
