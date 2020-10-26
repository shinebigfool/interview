package com.ThirdDivide;

import java.util.Scanner;

public class dps {
    public static int fun(int m,int n,int M,int N){
        if(m==M||n==N){
            return 1;
        }

        return fun(m+1,n,M,N)+fun(m,n+1,M,N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(fun(0,0,M,N));
    }
}
