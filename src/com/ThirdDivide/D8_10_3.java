package com.ThirdDivide;

import java.util.Scanner;

public class D8_10_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        String val = sc.nextLine();
        sc.close();
        int ans = recursion(target, val, target.length(), val.length());
        System.out.println(ans);
    }

    private static int recursion(String s1, String s2, int i, int j) {
        //由s1 --> s2
        if (j == 0) {
            return i;
        } else if (i == 0) {
            return j;
        } else if (s1.charAt(i-1) == s2.charAt(j - 1)) {//跳过
            return recursion(s1, s2, i - 1, j - 1);
        } else {
            int m1 = recursion(s1, s2, i - 1, j) + 1;//删掉一个字符
            int m2 = recursion(s1, s2, i, j - 1) + 1;//增加一个字符
            int m3 = recursion(s1, s2, i - 1, j - 1) + 1;//替换一个字符
            return Math.min(Math.min(m1, m2), m3);
        }
    }

}
