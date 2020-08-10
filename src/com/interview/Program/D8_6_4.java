package com.interview.Program;

import java.util.Scanner;

public class D8_6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m = sc.nextInt();
//        System.out.println(N);
//        System.out.println(m);
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        int mod = N%m;
        int groupN = N/m;

        if(mod>0&&groupN>0){
            for (int i = N-mod;i<N;i++){
                System.out.print(nums[i]+" ");
            }
            for (int i = groupN-1;i>0;i--){
                for (int j = 0;j<m;j++){
                    System.out.print(nums[j+i*m]+" ");
                }
            }
            for (int i = 0;i<m-1;i++){
                System.out.print(nums[i]+" ");
            }
            System.out.print(nums[m-1]);
        }
        if(groupN==0){
            for (int i = 0;i<m-1;i++){
                System.out.print(nums[i]+" ");
            }
            System.out.print(nums[m-1]);
        }
        if(mod==0){
            for (int i = groupN-1;i>0;i--){
                for (int j = 0;j<m;j++){
                    System.out.print(nums[j+i*m]+" ");
                }
            }
            for (int i = 0;i<m-1;i++){
                System.out.print(nums[i]+" ");
            }
            System.out.print(nums[m-1]);
        }
    }
}
