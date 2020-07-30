package com.interview.Tread;

import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable{
    private int num = 10; //控制了同一个资源
    ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        try {
            if(num>=1){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num--;
                System.out.println(Thread.currentThread().getName()+":"+num);
            }else{
                System.out.println("库存不足");
            }
        }catch (Exception e){

        }finally {
            lock.unlock();
        }


    }
}
