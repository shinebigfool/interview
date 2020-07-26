package com.interview.Algorithm;

import org.junit.Test;

public class BigPlus {
    @Test
    public void test(){
        String a = "10001";
        String b = "999999";
        char[] larger = null;
        char[] smaller = null;
        if(a.length() >= b.length()){
            larger=a.toCharArray();
            smaller=b.toCharArray();
        }else {
            larger=a.toCharArray();
            smaller=b.toCharArray();
        }
        int[] sums = new int[larger.length+1];
        for (int i=0;i<larger.length;i++) {
            sums[i]=larger[larger.length-i-1]-'0';
        }
        for(int i =0;i<smaller.length;i++){
            sums[i]+=smaller[smaller.length-i-1]-'0';
        }
        for(int i = 0;i<sums.length-1;i++){
            if(sums[i]>9){
                sums[i+1]+=1;
                sums[i]-=10;
            }
        }
        StringBuilder builder = new StringBuilder();
        for(int i=sums.length-1;i>=0;i--){
            builder.append(sums[i]);
        }
        String result = builder.toString();
        if(result.startsWith("0")){
            result = result.substring(1);
        }
        System.out.println(result);
    }
}
