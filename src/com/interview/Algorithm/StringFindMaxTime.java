package com.interview.Algorithm;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFindMaxTime {
    //出现最大次数
    @Test
    public void test1(){
        String str = "adcxasdajbdbasfbsdajkdklckjbasdfk";
        char res = str.charAt(0);
        int max = 0;
        for (int i = 0;i<str.length();i++){
            char temp = str.charAt(i);
            int count = 0;
            for (int j = 0;j<str.length();j++){
                if(str.charAt(j)==temp){
                    count++;
                }
            }
            if(count>=max){
                max=count;
                res=temp;
            }
        }
        System.out.println(res+ " max times:"+max);
    }
    //出现最大次数+第一个只出现一次的字符
    @Test
    public void test2(){
        String str = "adcxasdaajbdbasfbsdajkdklckjbasdfk";
        Map<Character,Integer> map = new HashMap<>();
        char res = str.charAt(0);
        int max = 0;
        for (int i = 0;i<str.length();i++){
            char temp = str.charAt(i);
            Integer count = map.get(temp);
            if(count==null){
                //map.put(temp,1);
                count=1;
            }
            else {
                //map.put(temp,count+1);
                count++;
            }
            map.put(temp,count);
            if(count>max){
                max=count;
                res=temp;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i))==1){
                System.out.println(str.charAt(i));
                break;
            }
        }
        System.out.println(res+ " max times:"+max);
    }
    //第一个重复的字符
    @Test
    public void test3(){
        String str = "abccab";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(!set.add(str.charAt(i))){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
    //第一个只出现一次的字符
    @Test
    public void test4(){
        String str = "azbgccbdae";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(str.indexOf(c)==str.lastIndexOf(c)){
                System.out.println(c);
                break;
            }
        }
    }
    //桶排序，一串数字出现次数排序
    @Test
    public void test5(){
        int count[] = new int[10];
        String str = "5225985223464398";
        for (int i = 0; i < str.length(); i++) {//桶排序
            char c = str.charAt(i);
            count[c-'0']++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]>0){
                System.out.println(i+"出现了"+count[i]+"次");
            }
        }
    }

}
