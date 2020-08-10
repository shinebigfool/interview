package com.interview.Program;

import java.util.Scanner;

public class D8_2_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        StringBuilder builder = new StringBuilder();
        String[] mother = a.split(" ");
        String[] insert = b.split(" ");
        int k = 0;
        int j = 0;
        int i = 0;

        while (k<insert.length&&j<mother.length&&i<mother.length+insert.length-1){
            if(i%5==4){
                builder.append(insert[k]);
                builder.append(" ");
                k++;
            }else {
                builder.append(mother[j]);
                builder.append(" ");
                j++;
            }
            i++;
        }
        while (k<insert.length){
            builder.append(insert[k]);
            if(i==mother.length+insert.length-1){
                break;
            }
            builder.append(" ");
            k++;
            i++;
        }
        while (j<mother.length){
            builder.append(mother[j]);
            if(i==mother.length+insert.length-1){
                break;
            }
            builder.append(" ");
            j++;
            i++;
        }
        System.out.println(builder.toString());
    }
}
