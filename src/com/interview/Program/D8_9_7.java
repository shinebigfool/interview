package com.interview.Program;

import java.util.Scanner;

public class D8_9_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        int[] nums = new int[input.length];
        int l = input.length;
        if((l+1&l)==0){
            System.out.println("yes");
        }
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        for(int i = input.length-1;i>=0;i--){
            if((i-1)%2==1){
                if(nums[i]<nums[(i-1)/2]){
                    System.out.println("False");
                    return;
                }
            }
            else {
                if(nums[i]>nums[(i-1)/2]){
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }
}
