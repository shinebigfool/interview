package com.ThirdDivide;

import java.util.Arrays;
import java.util.Scanner;

public class D8_10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int N = n*n;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(nums);
        System.out.println(nums[k-1]);
    }
}
