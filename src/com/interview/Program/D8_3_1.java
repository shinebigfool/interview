package com.interview.Program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D8_3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
            
        }
        if(N<3){
            System.out.println(N);
            return;
        }

        Arrays.sort(nums);
        Set<Integer> step = new HashSet<>();
        int max = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int k = i+1;k<nums.length;k++){
                int st = nums[k]-nums[i];
                int count = 2;
                int next = nums[k]+st;
                if(step.add(st)){
                    for(int j = k+1;j<nums.length;j++){
                        if(nums[j]==next){
                            next+=st;
                            count++;
                        }else if(nums[j]>next){
                            break;
                        }
                    }
                    if(count>max){
                        max = count;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
