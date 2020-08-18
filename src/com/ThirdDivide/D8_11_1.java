package com.ThirdDivide;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D8_11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        Map<Integer,Double> rank = new HashMap<>();
        DecimalFormat df1 = new DecimalFormat("0.000000");
        for (int i = 0; i < q; i++) {
            int target = sc.nextInt();
            int score = scores[target-1];
            if(rank.get(score)!=null){
                System.out.println(String.format("%.6f",rank.get(score)));
                continue;
            }
            int sum = -1;
            for (int score1 : scores) {
                if(score>=score1){
                    sum++;
                }
            }
            double targetRank = new BigDecimal((float)sum/n).setScale(8,BigDecimal.ROUND_HALF_UP).doubleValue();
            rank.put(score,targetRank*100);
            System.out.println(df1.format(targetRank*100));
        }
    }
}
