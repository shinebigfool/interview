package com.interview.Tread;

import org.junit.Test;

import java.util.concurrent.*;

public class ThreadTest {
    @Test
    public void test1() throws Exception{
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.start();
        t2.start();
        Thread.sleep(1000);
    }
    @Test
    public void test2() throws Exception{
        MyRunnable runnable = new MyRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
        Thread.sleep(1000);
    }
    @Test
    public void test3() throws Exception{
        Callable<Integer> callable = new MyCallable();
        FutureTask<Integer> task1 = new FutureTask<>(callable);
        FutureTask<Integer> task2 = new FutureTask<>(callable);
        new Thread(task1).start();
        new Thread(task2).start();
        Integer num1 = task1.get();
        Integer num2 = task2.get();
        System.out.println(num1);
        System.out.println(num2);
    }
    @Test
    public void test4() throws Exception{
        ExecutorService pool = Executors.newFixedThreadPool(3);
        MyRunnable runnable = new MyRunnable();
        pool.submit(runnable);//runnable 直接submit
        pool.submit(runnable);
        pool.submit(runnable);
        pool.submit(runnable);
        Callable<Integer> callable = new MyCallable();
        //callable 也是直接submit，返回值是Future，可以用get方法获取callable的返回值
        Future<Integer> future = pool.submit(callable);
        System.out.println(future.get());
        pool.shutdown();
    }
    public void add(Byte b)
    {
        b = b++;
    }
    @Test
    public void test5(){
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
        String s = "祝你考出好成绩！";
        System.out.println(s.length());

    }
    @Test
    public void test6(){
        float t = (float) 5.1;
        float t1 = 5.1f;
        int i = (byte) t;
        int i1 = (int) t1;
        System.out.println(t+"   "+i+"    "+i1);
    }


}
