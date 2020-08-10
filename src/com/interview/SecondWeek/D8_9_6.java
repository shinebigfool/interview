package com.interview.SecondWeek;

import java.util.Map;
import java.util.Scanner;

public class D8_9_6 {
    public static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] map = new int[m][n];
        move(0,0,m,n,k,map);
        System.out.println(count);
    }
    public static void move(int x, int y, int m, int n, int k, int[][] map){
        if(x==m||y==n){
            return;
        }
        if(map[x][y]!=0){
            return;
        }
        if(sum(x,y)<=k){
            map[x][y] = 1;
            count++;
            move(x+1,y,m,n,k,map);
            move(x,y+1,m,n,k,map);
        }


    }
    public static int sum(int x ,int y){
        String row = String.valueOf(x);
        String col = String.valueOf(y);
        int sum = 0;
        for (int i = 0; i < row.length(); i++) {
            sum+=row.charAt(i)-'0';
        }
        for (int i = 0; i < col.length(); i++) {
            sum+=col.charAt(i)-'0';
        }
        return sum;
    }
}
