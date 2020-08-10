package com.interview.Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D8_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bads = sc.nextLine().split("=")[1];
        String[] baddict = sc.nextLine().split("=")[1].split(",");
        //System.out.println(bads);
        String s = bads.substring(1,bads.length()-1);
        //System.out.println(s);
        List<String> str = new ArrayList<>();
        String[] dict = new String[baddict.length];
        for (int i = 0; i < baddict.length; i++) {
            dict[i] = baddict[i].substring(1,baddict[i].length()-1);
            //System.out.println(dict[i]);
        }

    }
    public static int count = 0;


    public static void findSub(String[] dict, String s, int nowIndex,ArrayList<String> str) {
        for (int i = 0; i < dict.length; i++) {
            int subIndex = s.indexOf(dict[i], nowIndex);
            if(subIndex==nowIndex){
                nowIndex += dict[i].length();
                str.add(dict[i]);
                if(nowIndex==s.length()){
                    for (int i1 = 0; i1 < str.size()-1; i1++) {
                        System.out.print(str.get(i1)+" ");
                    }
                    System.out.println(dict[i]);
                    return;
                }else {
                    findSub(dict,s,nowIndex,str);
                }
            }
        }

    }
}
