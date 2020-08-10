package com.interview.Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D8_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        int[] count = new int[input.length()];
        count[0] = input.indexOf(ch);
        for (int i = 1; i < input.length(); i++) {
            int temp = input.indexOf(ch,i)-i;
            if(temp>count[i-1]||temp<0){
                count[i] = count[i-1]+1;
            }else {
                count[i] = temp;
            }
        }
        System.out.print("[");
        for (int i = 0; i < count.length-1; i++) {
            System.out.print(count[i]+",");
        }
        System.out.print(count[count.length-1]);
        System.out.print("]");
    }
}
