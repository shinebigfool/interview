package com.interview.Program;

import org.junit.Test;

import java.util.*;

public class D8_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nums = new ArrayList<>();
        String temp=sc.nextLine();
        while (!temp.equals("END")){
            nums.add(temp);
            temp = sc.nextLine();
        }
        if(nums.size()==0){
            System.out.println("None");
            return;
        }
        if(nums.size()==1){
            System.out.println(nums.get(0));
            return;
        }
        int[] arr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            String[] te = nums.get(i).split("#");
            if(te.length!=2){
                System.out.println("None");
                return;
            }
            arr[i] = Integer.parseInt(te[1],Integer.parseInt(te[0]));
        }
        boolean judge = false;
        for (int i = 0; i < arr.length; i++) {
            int t = arr[i];
            int count = 0;
            for (int value : arr) {
                if (t == value) {
                    count++;
                    if (count > 1) {
                        break;
                    }
                }

            }
            if(count==1){
                judge = true;
                System.out.println(nums.get(i));
            }
        }
        if(!judge){
            System.out.println("None");
        }
    }
}
