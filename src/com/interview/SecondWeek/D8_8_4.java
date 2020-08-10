package com.interview.SecondWeek;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D8_8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        Set<Character> set = new HashSet<>();
        for (int length = num.length()-1; length >= 0; length--) {
            if(set.add(num.charAt(length))){
                System.out.print(num.charAt(length));
            }
            if(set.size()==10){
                break;
            }
        }
    }
}
