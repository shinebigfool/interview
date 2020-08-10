package com.interview.SecondWeek;

import java.util.Scanner;

public class D8_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fun(n));
    }
    public static int fun(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n>2){
            return fun(n-1)+fun(n-2);
        }
        return 0;
    }
}
