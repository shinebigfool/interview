package com.interview.SecondWeek;

import java.util.List;
import java.util.Scanner;

public class D8_8_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] warn = new int[n];
        for (int i = 0; i < n; i++) {
            warn[i] = sc.nextInt();
        }
        int[] time = new int[n];
        int[] count = new int[n];
        time[0] = warn[0]<=s?1:0;
        count[0] = warn[0];
        int max = 0;
        for (int i = 1; i < n; i++) {
            int temp = count[i-1]+warn[i];
            if(temp<=s){
                time[i] = time[i-1]+1;
                count[i] = temp;
            }else{
                int j = i;
                do {
                    count[i] += warn[j];
                    time[i]++;
                    j--;
                }while (j>=0&&count[i] + warn[j] <= s);
            }
            if(time[i]>max){
                max=time[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < time.length; i++) {
            System.out.print(time[i]+" ");
        }
        System.out.println();
        for (int i : count) {
            System.out.print(count[i]+" ");
        }
    }

}
