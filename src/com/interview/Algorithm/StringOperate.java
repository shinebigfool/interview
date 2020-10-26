package com.interview.Algorithm;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOperate {
    //截取指定长度字节的字符串
    @Test
    public void test6(){
        String str="人sa们sakjfkjk迪奥dada";
        int count = 9;
        int sum = 0;//已经截取了多少
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int len = String.valueOf(str.charAt(i)).getBytes().length;
            if(sum+len<=count){
                sum+=len;
                builder.append(str.charAt(i));
            }else {
                break;
            }
        }
        System.out.println(builder.toString());
    }
    //截取指定内容
    @Test
    public void test7(){
        String str = "<p id = \"text\">abcdefg</p>";
//        String reg = "efg";
//        int index = str.indexOf(reg);
//        String target = str.substring(index,reg.length());
        String reg = "(.*)(efg)(.*)";//正则表达式
        Pattern pattern = Pattern.compile(reg);//编译
        Matcher matcher = pattern.matcher(str);//匹配
        if(matcher.find()){
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }
    String inverseSentence (String in,String sep){
        String[] arrs = in.split(sep);
        StringBuilder builder = new StringBuilder();
        for(int i = arrs.length-1;i>=0;i--){
            builder.append(arrs[i]);
            builder.append(sep);
        }
        return builder.substring(0,builder.length()-sep.length());
    }
    //判断是否ipv4
    public boolean checkIp(String ip){
        String[] arrs = ip.split("\\.");//转译
        if(arrs.length!=4){
            return false;
        }
        for (String arr : arrs) {
            try {
                int num = Integer.parseInt(arr);
                if(num>255||num<0){
                    return false;
                }
                if(!arr.equals("0")&&arr.startsWith("0")){
                    return false;
                }
            }catch (Exception e){
                return false;
            }
        }
        return true;
    }
    public boolean checkIp2(String ip){
        String[] arrs = ip.split("\\.");//转译
        if(arrs.length!=4){
            return false;
        }
        String reg = "\\d||[1-9]\\d{1,2}";
        for (String arr : arrs) {
            try {
                if(!arr.matches(reg)||Integer.parseInt(arr)>255){
                    return false;
                }
            }catch (Exception e){
                return false;
            }
        }
        return true;
    }
}
