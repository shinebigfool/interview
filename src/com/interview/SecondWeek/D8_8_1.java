package com.interview.SecondWeek;

import java.util.Arrays;
import java.util.Scanner;

public class D8_8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] gi = sc.nextLine().split(" ");
        String[] sj = sc.nextLine().split(" ");
        int[] eat = new int[gi.length];
        int[] food = new int[sj.length];
        for (int i = 0; i < gi.length; i++) {
            eat[i] = Integer.parseInt(gi[i]);
        }
        for (int i = 0; i < sj.length; i++) {
            food[i] = Integer.parseInt(sj[i]);
        }
        Arrays.sort(eat);
        Arrays.sort(food);
        int elef = 0;
        int flef = 0;
        int count = 0;
        while (elef<eat.length&&flef<food.length){
            if(food[flef]>=eat[elef]){
                count++;
                flef++;
                elef++;
            }else {
                flef++;
            }
        }
        System.out.println(count);
    }
}
