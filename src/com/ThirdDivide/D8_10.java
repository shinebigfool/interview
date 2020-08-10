package com.ThirdDivide;

import org.junit.Test;

import java.util.Scanner;

public class D8_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        sc.close();
        add(input[0],input[1]);
    }
    public static void add(String a,String b){
        int x = a.length()-1,y = b.length()-1;
        StringBuilder builder = new StringBuilder();
        char k = '0';
        while (x>=0&&y>=0){
            char i = a.charAt(x);
            char j = b.charAt(y);
            int plus = plus(i, j, k);
            if(plus ==3){
                k='1';
                builder.append(1);
            }
            else if(plus==2){
                k='1';
                builder.append(0);
            }else if(plus==1){
                k='0';
                builder.append(1);
            }else if(plus ==0){
                k='0';
                builder.append(0);
            }
            x--;
            y--;
        }
        while (x>=0){
            char i = a.charAt(x);
            char j = '0';
            int plus = plus(i, j, k);
            if(plus ==3){
                k='1';
                builder.append(1);
            }
            else if(plus==2){
                k='1';
                builder.append(0);
            }else if(plus==1){
                k='0';
                builder.append(1);
            }else if(plus ==0){
                k='0';
                builder.append(0);
            }
            x--;
        }
        while (y>=0){
            char i = '0';
            char j = b.charAt(y);
            int plus = plus(i, j, k);
            if(plus ==3){
                k='1';
                builder.append(1);
            }
            else if(plus==2){
                k='1';
                builder.append(0);
            }else if(plus==1){
                k='0';
                builder.append(1);
            }else if(plus ==0){
                k='0';
                builder.append(0);
            }
            y--;
        }
        if(k=='1'){
            builder.append(1);
        }
        builder.reverse();
        System.out.println(builder.toString());
    }
    public static int plus(char i,char j,char k){
        int sum = i - '0' + j - '0' + k - '0';
        if(sum == '3'-'0'){
            return 3;
        }
        else if(sum=='2'-'0'){
            return 2;
        }else if(sum=='1'-'0'){
            return 1;
        }else {
            return 0;
        }
    }
}
