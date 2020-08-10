package com.interview.Program;

import java.util.List;
import java.util.Scanner;

public class D8_3 {
    public static int min = Integer.MAX_VALUE;
    public static int part1 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum+=nums[i];
        }
        kSum(nums,sum,0);
        System.out.println(min);
    }
    public static void kSum(int[] numbers, int sum, int i) {
        int part2 = sum - part1;
        if(Math.abs(part2-part1)==0) {
            min = 0;
            return;
        }
        if(Math.abs(part2-part1)<min){
            min = Math.abs(part2-part1);
        }
        if(i == numbers.length)  return;
        part1 += numbers[i];
        kSum(numbers, sum, i + 1);
        part1 -= numbers[i];
        kSum(numbers, sum, i + 1);
    }
}
