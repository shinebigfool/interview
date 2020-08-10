package com.interview.test;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

public class CodeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] uti = str.split(" ");
        String a = uti[0];
        String b = uti[1];
        String c = uti[2];
        String[] array = c.split(a);
        System.out.println(array.length);
        String[] key = new String[array.length];
        String[] value = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            key[i] = array[i].split(b)[0];
            value[i] = array[i].split(b)[1];
            System.out.println(key[i]+" "+value[i]);
        }

    }
    @Test
    public void test(){
        //System.out.print(B.c);
        Animal a = new Animal();
        Animal b = new Dog();
        a.move();
        b.move();
        
    }
    @Test
    public void test1(){
        Date date=new Date();
        System.out.printf("%tD%n",date);
    }
    @Test
    public void test2(){
        System.out.println(Math.ceil(1.2));
        //test3("i am a student");
    }
    @Test
    public void test3(){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] array = a.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = array.length-1; i  > 0; i--) {
            builder.append(array[i]);
            builder.append(" ");
        }
        builder.append(array[0]);
        System.out.println(builder.toString());
    }
    @Test
    public void test4(){
        int a = 10;
        double b = 3.14;
        System.out.println('A'+a+b);
    }
    @Test
    public void test5(){
        int i = 0;
        i = i++ + i;
        System.out.println(i);
    }
}
