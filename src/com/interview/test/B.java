package com.interview.test;

class B extends A{
    public static String c = "BC";
    static {
        System.out.print("B");
    }

    public static void main(String[] args) {
        A b = new B();
        System.out.println(b.c);
    }
}