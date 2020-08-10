package com.interview.Program;

import java.util.Scanner;

public class D8_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);
        char[][] answer = new char[n][m];
        int[] score = new int[m];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String answ = sc.nextLine();
            for (int i1 = 0; i1 < m; i1++) {
                answer[i][i1] = answ.charAt(i1);
            }
        }
        String[] score_str = sc.nextLine().split(" ");
        for (int i = 0; i < score_str.length; i++) {
            score[i] = Integer.parseInt(score_str[i]);
        }
        for (int i = 0; i < m; i++) {
            char res = answer[0][i];
            int max = 0;
            for (int i1 = 0; i1 < n; i1++) {
                char temp = answer[i1][i];
                int count = 0;
                for (int i2 = 0; i2 < n; i2++) {
                    if(temp==answer[i2][i]){
                        count++;
                    }
                }
                if(count>max){
                    max = count;
                    res = temp;
                }
            }
            sum+=max*score[i];
        }
        System.out.println(sum);
    }

}
