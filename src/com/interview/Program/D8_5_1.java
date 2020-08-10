package com.interview.Program;

import java.util.Scanner;

public class D8_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        String nums = input.substring(input.indexOf("[")+1,input.indexOf("]"));
        System.out.println(nums);
        String[] numArr = nums.split(",");
        int[] arr = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            arr[i]= Integer.parseInt(numArr[i]);
        }
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int count = 0;
            for (int i1 = 0; i1 < arr.length; i1++) {
                if(temp==arr[i1]){
                    count++;
                }
            }
            if(count>arr.length/2){
                System.out.println(temp);
                return;
            }
        }
    }
}
