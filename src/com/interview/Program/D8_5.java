package com.interview.Program;

import java.util.Scanner;

public class D8_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input= sc.nextLine();
        String nums = input.substring(input.indexOf("[")+1,input.indexOf("]"));
        System.out.println(nums);
        String[] numArr = nums.split(",");
        int[] arr = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            arr[i]= Integer.parseInt(numArr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                continue;
            }
            if(arr[i]>0){
                if(arr[i]+i>=arr.length){
                    System.out.println(true);
                    return;
                }
            }
            if(arr[i]<0){
                if(i+arr[i]<0){
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }

}
