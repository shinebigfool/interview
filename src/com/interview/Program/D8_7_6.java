package com.interview.Program;

import org.junit.Test;

import java.util.Scanner;

public class D8_7_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(sum(input));
    }
    public static int sum(String s){
        if(s.length()==1||s.length()==0){
            return 1;
        }

        if(s.charAt(0)!='1'&&s.charAt(0)!='2'){
            return sum(s.substring(1));
        }
        if(s.charAt(0)=='1'){
            return sum(s.substring(1))+sum(s.substring(2));
        }
        if(s.charAt(0)=='2'){
            if(s.charAt(1) - '0' < 7){
                return (sum(s.substring(1))+sum(s.substring(2)));
            }else {
                return sum(s.substring(1));
            }
        }
        return 0;
    }
    @Test
    public void test(){
        String s = "226";
        System.out.println(s.substring(1));
        System.out.println(s.substring(1).length());
    }
}
