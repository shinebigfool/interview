package com.interview.Program;

import java.util.Scanner;

public class D8_7_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] list = sc.next().toCharArray();
        int L = 0;
        int res1 = 0;
        int res2 = 0;
        for(int i = 0; i < list.length ; i++){
            if(list[i] != 'C'){
                res1 += i - L;
                L++;
            }
        }
        L = list.length-1;
        for(int i = 0; i < list.length; i++){
            if(list[i] != 'C'){
                res2 += L - i;
                L--;
            }
        }
        System.out.println(Math.min(res1, res2));
    }
}
