package com.interview.Program;

import java.util.Scanner;

public class D8_7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String preInput = sc.nextLine();
        String midInput = sc.nextLine();
        String[] pre = preInput.split(" ");
        String[] mid = midInput.split(" ");
        int N= pre.length;
        int high = (int) (Math.log(N+1)/Math.log(2));
        System.out.println(high);
        
    }
}
