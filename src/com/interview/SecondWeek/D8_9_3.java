package com.interview.SecondWeek;

import java.util.Scanner;

public class D8_9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        System.out.println(words[words.length-1].length());
    }
}
