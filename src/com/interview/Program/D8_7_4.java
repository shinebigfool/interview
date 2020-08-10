package com.interview.Program;

import java.util.Scanner;

public class D8_7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] prices = new int[input.length];
        int[] count = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            prices[i] = Integer.parseInt(input[i]);
        }
        count[0] = 0;
        count[1] = prices[1]-prices[0];
        int max = count[0];
        for (int i = 1; i < prices.length; i++) {
            if(count[i-1]<0){
                count[i] = prices[i]-prices[i-1];
            }
            else{
                count[i]=count[i-1]+prices[i]-prices[i-1];
            }
            if(max<count[i]){
                max = count[i];
            }
        }
        if(max <0){
            max = 0;
        }
        System.out.println(max);
    }
}
