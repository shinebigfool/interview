package com.interview.Program;

import org.junit.Test;

import java.util.Stack;

public class D8_4_3 {

    private static int x = 10;
    private static Integer y = 10;

    public static void updateX(int value) {
        value = 3 * value;
    }

    public static void updateY(Integer value) {
        value = 3 * value;
    }

    public static void main(String[] args) {
        updateX(x);
        updateY(y);
        System.out.println(x);
        System.out.println(y);
        Stack<Integer> stack1 = new Stack<>();
    }
    @Test
    public void test(){
        String a="a";
        String b="b";
        String c=a+b;
        String d=new String("ab");
        System.out.println(a+b==c);
        System.out.println(c==d);
    }

}
