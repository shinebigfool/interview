package com.interview.SecondWeek;

import java.util.Scanner;

public class D8_8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        int[] cost = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            cost[i] = Integer.parseInt(input[i]);
        }
        int sum = 0;
        int[] count = new int[cost.length];
        count[0] = 0;
        count[1] = 0;
        if(input.length==2){
            System.out.println(Math.min(cost[0],cost[1]));
            return;
        }
        for (int i = 2; i < count.length; i++) {

            int temp = Math.min(count[i-1]+cost[i-1],count[i-2]+cost[i-2]);
            count[i] = temp;
        }

        System.out.println(Math.min(count[count.length-1]+cost[count.length-1],count[count.length-2]+cost[count.length-2]));
    }

}
