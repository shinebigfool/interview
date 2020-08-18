package com.ThirdDivide;

import java.util.Scanner;

public class D8_11_6 {
    public static int sp(long a,long b,long p,int q){
        int count = 0;
        while (a<b){
            if(a+p>=b){
                a=a+p;
            }else {
                p = p*q;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            long a = scanner.nextInt();
            long b = scanner.nextInt();
            long p = scanner.nextInt();
            int q = scanner.nextInt();
            System.out.println(sp(a,b,p,q));
        }
    }
}
