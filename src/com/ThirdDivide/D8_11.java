package com.ThirdDivide;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class D8_11 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        dp(nums,0,n);
        System.out.println(set.first());
    }
    public static TreeSet<String> set = new TreeSet<>();
    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void dp(int[] a,int first,int n){
        set.add(Arrays.toString(a));
        for (int i = first;i<n;i++){
            if((a[i]+a[first])%2==1){
                swap(a,i,first);
                dp(a,first+1,n);

            }

        }
    }
    @Test
    public void test(){
        int i =0;
        int sum = 10;
        try {
            System.out.print(sum/(i++));
        }catch (Exception e){

        }
        System.out.print(i);
    }
}
