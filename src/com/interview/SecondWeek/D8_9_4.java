package com.interview.SecondWeek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D8_9_4 {
    public static boolean judge(String a,String b){
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        int an = a.length();
        int bn = b.length();
        int smaller;
        if(an>bn){
            smaller = bn;
            for (int i = 0; i < smaller; i++) {
                if(ac[i]>bc[i]){
                    return true;
                }
                if(ac[i]<bc[i]){
                    return false;
                }
            }
            for (int i = bn;i<an;i++){
                if(ac[i]>ac[i%bn]){
                    return true;
                }
                if (ac[i]<ac[i%bn]){
                    return false;
                }
            }

        }
        if(an == bn){
            return Integer.parseInt(a)>Integer.parseInt(b);
        }
        if(an < bn){
            smaller = an;
            for (int i = 0;i<smaller;i++){
                if(ac[i]>bc[i]){
                    return true;
                }
                if(ac[i]<bc[i]){
                    return false;
                }
            }
            for (int i = an;i < bn;i++){
                if(ac[i]>ac[i%an]){
                    return true;
                }
                if (ac[i]<ac[i%an]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLine();
        }
//        for (String num : nums) {
//            System.out.println(num);
//        }
        for (int i = 0;i<n;i++){
            for (int j = i+1;j<n;j++){
                if(!judge(nums[i],nums[j])){
                    String t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }
        if(nums[0].startsWith("0")){
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
        }
    }
}
