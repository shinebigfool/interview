package com.interview.SecondWeek;

import java.util.Arrays;
import java.util.Scanner;

public class D8_9_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        String[] nums = input[0].split(" ");
        int target = Integer.parseInt(input[1]);
        int sum = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(arr);
        int count = 0;
        for (int value : arr) {
            if (value <= target) {
                count++;
            }
        }
        if(count<3){
            System.out.println("False");
            return;
        }
        for(int i = 0;i<count;i++){
            for (int j = i+1;j<count;j++){
                for (int k = j+1;k<count;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.println("True");
                        return;
                    }
//                    if(arr[i]+arr[j]+arr[k]>target){
//                        System.out.println("False");
//                        return;
//                    }
                }
            }
        }
        System.out.println("False");
    }
}
