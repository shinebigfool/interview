package com.interview.Singleton;

public class Singleton5 {
    private static Singleton5 instance=null;
    private Singleton5(){

    }
    private static final ThreadLocal<Singleton5> threadLocalSingleton = new ThreadLocal<Singleton5>(){
        @Override
        protected Singleton5 initialValue() {
            return new Singleton5();
        }
    };
    public static Singleton5 getInstance(){
        return threadLocalSingleton.get();
    }
}
