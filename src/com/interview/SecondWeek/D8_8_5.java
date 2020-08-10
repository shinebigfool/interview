package com.interview.SecondWeek;

import java.util.Scanner;

public class D8_8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] power = new int[n];
        for (int i = 0; i < n; i++) {
            power[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int d = sc.nextInt();
        int count[] = new int[n];
        int result = 1;
        for (int i = 0; i < k; i++) {
            result *= power[i];
        }
        count[k-1] = result;
        for (int i = k;i<n-1;i++){
            if(power[k]==0){
                count[k] = 0;
            }
        }
    }
}
