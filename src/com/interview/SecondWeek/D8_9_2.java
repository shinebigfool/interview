package com.interview.SecondWeek;

import java.util.Scanner;

public class D8_9_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        long N = scan.nextLong();
        while (N != 0) {
            count++;
            N = N & (N - 1);
        }
        System.out.println(count);
    }
}

