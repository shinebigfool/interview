package com.ThirdDivide;

import java.util.*;
public class D8_18{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        char[][] ans=new char[n][m];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            ans[i]=Arrays.copyOf(s.toCharArray(),m);
        }
        int[] score=new int[m];
        for(int i=0;i<m;i++){
            score[i]=sc.nextInt();
        }
        int res=0;
        for(int j=0;j<m;j++){
            int tmp=0;
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                int key=ans[i][j]-'A';
                if(map.containsKey(key)){
                    int t=map.get(key);
                    map.put(key,t+1);
                    tmp=Math.max(tmp,t+1);
                }else{
                    map.put(key,1);
                    tmp=Math.max(1,tmp);
                }
            }
            res+=tmp*score[j];
        }
        System.out.println(res);
    }
}
