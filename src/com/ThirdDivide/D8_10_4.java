package com.ThirdDivide;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class D8_10_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        int[] scores = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            scores[i] = Integer.parseInt(input[i]);
        }
        int[] food = new int[scores.length];
        Arrays.fill(food, 1);
        for (int i = 1; i < scores.length; i++) {
            if(scores[i]>scores[i-1]){
                food[i] = food[i-1]+1;
            }
        }
        for (int i = scores.length-1; i > 0; i--) {
            if(scores[i-1]>scores[i]){
                if(food[i-1]<=food[i]){
                    food[i-1] = food[i]+1;
                }
            }
        }
        int sum = 0;
        for (int i : food) {
            sum+=i;
        }
        System.out.println(sum);
    }

}
