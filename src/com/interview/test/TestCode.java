package com.interview.test;

import org.junit.Test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numstr = sc.nextLine();
        String[] num = numstr.split(",");
        Set<String> set = new HashSet<>();
        boolean judge = false;
        for (int i = 0; i < num.length; i++) {
            if(set.add(num[i])){
                continue;
            }else {
                judge = true;
                break;
            }
        }
        System.out.print(judge);
    }
    @Test
    public void test(){
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        System.out.println(f1==100);
    }

}
