package com.interview.Program;

import java.math.BigInteger;
import java.util.*;

public class D8_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i]=sc.nextInt();

        }
        Map<Integer, Long> first = new HashMap<>();
        Map<Integer, Long> third = new HashMap<>();
        int max = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum+=nums[i];
            first.put(i,sum);
        }
        sum=0;

        for (int n = N-1; n >= 0; n--) {

            sum+=nums[n];
            third.put(n,sum);
        }

        for (int n = N-1; n >= 0; n--) {
            long temp=first.get(n);
            for(int i = n+1;i<N;i++){
                if(third.get(i)==temp){
                    System.out.println(temp);
                    return;
                }
                if(third.get(i)<temp){
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
