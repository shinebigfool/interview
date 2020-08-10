package com.interview.Program;

import org.junit.Test;

import java.util.Scanner;

public class D8_6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        add(a,b);
    }
    public static void add(String a,String b){
        char[] large;
        char[] small;
        if(a.length()>=b.length()){
            large=a.toCharArray();
            small=b.toCharArray();
        }else {
            small=a.toCharArray();
            large=b.toCharArray();
        }
        int[] multi = new int[a.length()+b.length()];
        for(int j=small.length-1;j>=0;j--){//小数乘大数
            for(int i=large.length-1;i>=0;i--){
                int num1 = small[j]-'0';
                int num2 = large[i]-'0';
                multi[large.length-1-i+small.length-1-j]+=num1*num2;
            }
        }
        for(int i = 0;i<multi.length-1;i++){
            if(multi[i]>9){
                multi[i+1]+=multi[i]/10;
                multi[i]%=10;
            }
        }
        StringBuilder builder = new StringBuilder();
        for(int i=multi.length-1;i>=0;i--){
            builder.append(multi[i]);
        }
        String result = builder.toString();
        while (result.startsWith("0")){
            result = result.substring(1);
        }
        System.out.println(result);
    }
    @Test
    public void test1(){
        int i =10;
        System.out.println(fun(i));
    }
    int fun(int i)
    {
        return (i==2)?1:(i+fun(i-2));
    }
}
