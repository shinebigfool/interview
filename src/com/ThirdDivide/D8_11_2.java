package com.ThirdDivide;

import java.util.*;

public class D8_11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        Integer nums[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums, Collections.reverseOrder());
        Map<Integer,Integer> times = new HashMap<>();
        int[] X = new int[q];
        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();
            X[i] = x;
            int count = 0;
            for (int i1 = 0; i1 < n; i1++) {
                if(nums[i1]>=x){
                    count++;
                }else {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
