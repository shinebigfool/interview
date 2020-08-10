package com.interview.SecondWeek;

import java.util.Scanner;

public class D8_8_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] people = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int i1 = 0; i1 < M; i1++) {
                people[i][i1] = sc.nextInt();
            }
        }
//        for (int i = 0; i < N; i++) {
//            for (int i1 = 0; i1 < M; i1++) {
//                System.out.print(people[i][i1]+" ");
//            }
//            System.out.println();
//        }
        int index = 0;
        while (N>0&&M>0){
            fun(people,N,M,index);
            N-=2;
            M-=2;
            index+=1;
        }

    }
    public static void fun(int[][] matrix,int n ,int m,int index){
        if(n==1){
            for(int i = 0;i<m;i++){
                System.out.print(matrix[index][index+i]+" ");
            }
            return;
        }
        if(m==1){
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i+index][index]+" ");
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i+index][index]+" ");
        }
        for(int i = 1;i<m;i++){
            System.out.print(matrix[index+n-1][index+i]+" ");
        }
        for (int i = n-2;i>=0;i--){
            System.out.print(matrix[i+index][index+m-1]+" ");
        }
        for (int i = m-2;i>0;i--){
            System.out.print(matrix[index][i+index]+" ");
        }
    }
}
