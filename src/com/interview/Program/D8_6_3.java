package com.interview.Program;

import java.util.Scanner;

public class D8_6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char res = input.charAt(0);
        int max = 0;
        for (int i = 0;i<input.length();i++){
            char temp = input.charAt(i);
            int count = 0;
            for (int j = 0;j<input.length();j++){
                if(input.charAt(j)==temp){
                    count++;
                }
            }
            if(count>=max){
                max=count;
                res=temp;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < max; i++) {
            builder.append(res);
        }
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)!=res){
                builder.append(input.charAt(i));
            }
        }
        System.out.println(builder.toString());
    }
}
