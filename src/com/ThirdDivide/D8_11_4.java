package com.ThirdDivide;

import java.util.Scanner;

public class D8_11_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = scanner.nextInt();
        while (group-- > 0){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            if(backtrack(nums,0,n)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static boolean backtrack(int[] a,int first,int n){
        if(first==n){
            return judge(a);
        }
        for (int i = first; i < n; i++) {
            swap(a,first,i);
            if(backtrack(a,first+1,n)){
                return true;
            }
            swap(a,first,i);
        }
        return false;
    }
    public static boolean judge(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i]>a[(i+1)%a.length]+a[(a.length+i-1)%a.length]){
                return false;
            }
        }
        return true;
    }
}
