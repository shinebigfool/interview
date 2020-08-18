package com.ThirdDivide;

import java.util.Scanner;

public class D8_11_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0){
            int n = sc.nextInt();

            int first = n%9;
            int num = n/9;
            StringBuilder builder = new StringBuilder();
            if(first!=0){
                builder.append(first);
            }

            for (int i = 0; i < num; i++) {
                builder.append(9);
            }
            System.out.println(builder.toString());
        }
    }
}
