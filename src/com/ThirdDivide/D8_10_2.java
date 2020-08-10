package com.ThirdDivide;

import java.util.List;
import java.util.Scanner;

public class D8_10_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0){
            System.out.println(1);
            return;
        }
        int t=1;
        for(int i=1;i<=num;i++){
            t=t*i;
            while(t%10==0){
                t/=10;
            }
            t = t%100;
        }
        System.out.println(t%10);
    }

}
