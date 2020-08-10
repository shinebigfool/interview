package com.interview.Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumSubset {
    // 匹配方案个数
    public static int count = 0;
    public static int sum = 0;
    public static void kSum(List<Integer> numbers, int target, int i) {
        if(sum == target){
            count++;
            return;
        }
        if(i == numbers.size())  return;
        if(sum > target)  return;
        sum += numbers.get(i);
        kSum(numbers, target, i + 1);
        sum -= numbers.get(i);
        kSum(numbers, target, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        String[] str = source.split(",");
        List<Integer> in = new ArrayList<Integer>();
        for(int i = 0; i < str.length; i++)
            in.add(Integer.parseInt(str[i]));
        int target = Integer.parseInt(sc.nextLine());
        kSum(in, target, 0);
        System.out.println(count);
    }
}
