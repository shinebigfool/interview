package com.ThirdDivide;

import java.util.Scanner;

public class D8_11_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] index = new int[nums.length];
        for (int i = 0; i < index.length; i++) {
            index[i]=i+1;
        }
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    count+=j-i;
                }
            }
        }
        System.out.println(count);
    }
}
