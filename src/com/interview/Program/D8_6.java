package com.interview.Program;

import java.util.Scanner;
import java.util.UUID;

public class D8_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String a = input.substring(0,input.indexOf(";"));
        String b = input.substring(input.indexOf(";")+1);
        int lenB = b.length();
        int lenA = a.length();
        char firstB = b.charAt(0);
        if(lenA!=lenB){
            System.out.println(false);
            return;
        }

        boolean judge = false;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {

            if(a.charAt(i)==firstB){
                String temp = a.substring(i)+builder.toString();
                if(temp.equals(b)){
                    judge = true;
                    break;
                }
            }
            builder.append(a.charAt(i));
            //System.out.println(builder.toString());
        }
        System.out.println(judge);
    }
}
