package com.interview.Program;

import java.util.Scanner;

public class D8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(sum(x+1,y+1));
    }
    public static int sum(int m, int n)//递归
    {
        if (m == 1 || n == 1)
            return 1;
        return sum(m - 1, n) + sum(m, n - 1);
    }
}
