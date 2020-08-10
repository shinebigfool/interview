package com.interview.Program;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class D8_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        String nums = input.substring(input.indexOf("[")+1,input.indexOf("]"));
        //System.out.println(nums);
        String[] numArr = nums.split(",");
        Integer[] arr = new Integer[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            arr[i]= Integer.parseInt(numArr[i]);
        }
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[2]);
    }
}
