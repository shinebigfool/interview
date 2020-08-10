package com.interview.Program;

import org.junit.Test;

import java.util.Scanner;

public class D8_6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        if(N!=input.length()||N%3!=1){
            return;
        }
        int maxBlank = N/3;
        for (int i = 0; i < maxBlank; i++) {
            for (int i1 = 0; i1 < i; i1++) {
                System.out.print(" ");
            }
            System.out.print(input.charAt(2*i));
            for (int i1 = 0; i1 < 2*maxBlank-1-2*i; i1++) {
                System.out.print(" ");
            }
            System.out.println(input.charAt(2*i+1));
        }
        for (int i = maxBlank;i<2*maxBlank+1;i++){
            for (int i1 = 0; i1 < maxBlank; i1++) {
                System.out.print(" ");
            }
            System.out.println(input.charAt(maxBlank+i));
        }
    }
    @Test
    public void test(){
        int x=10;

        x+=x-=x-x;
        System.out.println(x);
    }
}
