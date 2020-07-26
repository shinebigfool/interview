package com.interview.Algorithm;

import org.junit.Test;

public class BigMult {
    @Test
    public void test(){
        String a ="99";
        String b = "99";
        char[] large = null;
        char[] small = null;
        if(a.length()>=b.length()){
            large=a.toCharArray();
            small=b.toCharArray();
        }else {
            large=a.toCharArray();
            small=b.toCharArray();
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
        if(result.startsWith("0")){
            result = result.substring(1);
        }
        System.out.println(result);
    }
}
