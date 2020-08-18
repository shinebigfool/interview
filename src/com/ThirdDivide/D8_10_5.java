package com.ThirdDivide;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class D8_10_5 {

    //标准的全排列问题，有重复的全排列，偷懒的就用set去重，答案要求字典顺序输出，就用TreeSet咯，
    static TreeSet<String> output = new TreeSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        backtrack(s.toCharArray(), 0, s.length());
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (String item : output) {
            sb.append(item).append(",").append(" ");
        }
        System.out.println(sb.substring(0, sb.length() - 2) + "]");
    }
    //回溯算法
    private static void backtrack(char[] chars, int first, int n) {
        if (first == n) {
            output.add(String.valueOf(chars));
            return;
        }
        for (int i = first; i < n; i++) {
            swap(chars, first, i);
            backtrack(chars, first + 1, n);
            //回溯
            swap(chars, first, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}