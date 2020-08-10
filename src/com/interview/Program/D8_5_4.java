package com.interview.Program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

class Pair {
    String key;
    int val;

    Pair(String key, int val) {
        this.key = key;
        this.val = val;
    }
}


public class D8_5_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        //保存字符和其对应的十进制值的list集合
        ArrayList<Pair> list = new ArrayList<>();
        //对应的10进制的值和出现的次数
        HashMap<Integer, Integer> map = new HashMap<>();
        while (!(str = bf.readLine()).equals("END")) {
            int value = getValue(str);
            list.add(new Pair(str, value));
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        boolean reslut = false;
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i).val) == 1) {
                reslut = true;
                System.out.println(list.get(i).key);
            }
        }
        if (!reslut) {
            System.out.println("None");
        }
    }

    //其他进制转10进制 注意 A表示10，B表示11....
    private static int getValue(String s) {
        String[] strs = s.split("#");
        int x = Integer.parseInt(strs[0]);//进制数
        int sum = 0;
        for (int i = 0; i < strs[1].length(); i++) {
            int n = strs[1].charAt(i) - '0';
            if (n > 9) {
                n = n - 7;
            }
            sum = sum * x + n;
        }
        return sum;
    }
}

