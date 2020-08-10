package com.interview.Program;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Threads4{
    public static void main(String[] args){
        new Threads4().go();
    }
    public void go(){
        Runnable r=new Runnable(){
            public void run(){
                System.out.print("foo");
            }
        };
        Thread t=new Thread(r);
        t.start();
    }
    @Test
    public void test(){
        TreeSet<Integer> set = new TreeSet<Integer>();
        TreeSet<Integer> subSet = new TreeSet<Integer>();
        for(int i=606;i<613;i++){
            if(i%2==0){
                set.add(i);
            }
        }
        subSet = (TreeSet)set.subSet(608,true,611,true);
        set.add(629);
        System.out.println(set+" "+subSet);
    }
    @Test
    public void test1(){
        int a = 100,b=50,c=a---b,d=a---b;
        System.out.println(a);//98
        System.out.println(b);//50
        System.out.println(c);//50
        System.out.println(d);//49
    }
    @Test
    public void test2(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        System.out.println(list.toString());
    }
    @Test
    public void test3(){
        System.out.println(String.valueOf("g"));
    }
}
