package com.interview.Program;

import java.util.Arrays;
import java.util.Scanner;

public class D8_7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] p = sc.nextLine().split(" ");
        int H = sc.nextInt();
        int[] food = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            food[i] = Integer.parseInt(p[i]);
        }
        Arrays.sort(food);
        int firstIndex = 0;
        for (int i = 0; i < food.length; i++) {
            if(food[i]>0){
                firstIndex = i;
                break;
            }
        }
        int trueLength = food.length-firstIndex;
        if(H==trueLength){
            System.out.println(food[food.length-1]);
            return;
        }
        if(H<trueLength){
            return;
        }
        int temp = food[firstIndex];
        while (sum(food,firstIndex,temp)>H){
            temp++;
        }
        System.out.println(temp);
    }
    public static int sum(int[] food,int firstIndex,int k){
        int count = 0;
        for (int i = firstIndex; i < food.length; i++) {
            count+=food[i]/k;
            if(food[i]%k!=0){
                count+=1;
            }
        }
        //System.out.println(count);
        return count;
    }
}
