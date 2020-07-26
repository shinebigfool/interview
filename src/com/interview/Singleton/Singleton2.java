package com.interview.Singleton;

public class Singleton2 {
    private static class SingletonHolder{
        private static Singleton2 instance = new Singleton2();
    }
    private Singleton2(){
        if(SingletonHolder.instance!=null){
            throw new IllegalStateException();
        }
    }
    public static Singleton2 getInstance(){
        return SingletonHolder.instance;
    }
}
