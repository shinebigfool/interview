package com.interview.Program;

import java.util.Scanner;

public class D8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String num = sc.nextLine();
            String[] nums = num.split(" ");
            if(nums.length!=2){
                System.out.println(0);
                continue;
            }
            String[] n1 = nums[0].split("\\.");
            String[] n2 = nums[1].split("\\.");
            if(n1.length>4||n2.length>4){
                System.out.println(0);
            }else {
                boolean judge = false;
                int i1=0;
                int i2=0;
                while (i1<n1.length&&i2<n2.length){
                    if(n1[i1].equals(n2[i2])){
                        i1++;
                        i2++;
                        continue;
                    }
                    if(Integer.parseInt(n1[i1])>Integer.parseInt(n2[i2])){
                        break;
                    }else {
                        judge=true;
                        break;
                    }
                }
                System.out.println(judge);
            }

        }
    }
}
