package com.interview.Program;

import java.util.Scanner;

public class D8_6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int length = input.length(); length > 0; length--) {
            for (int i = 0;i<=input.length()-length;i++){
                String temp = input.substring(i,i+length);
                String reserve = new StringBuilder(temp).reverse().toString();
                if(temp.equals(reserve)){
                    System.out.println(temp);
                    return;
                }
            }
        }
    }
}
