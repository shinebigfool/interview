package com.interview.Tread;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(super.getName()+"started");
    }
}
