package com.interview.Program;

import java.util.Arrays;
import java.util.Scanner;

public class D8_7_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] weight = sc.nextLine().split(" ");
        int limit = sc.nextInt();
        int[] w = new int[weight.length];
        for (int i = 0; i < weight.length; i++) {
            w[i] = Integer.parseInt(weight[i]);
        }
        Arrays.sort(w);
        int[] rest = new int[weight.length];
        for (int i = 0; i < rest.length; i++) {
            rest[i] = limit-w[i];
        }
        int lef = 0;
        int rig = weight.length-1;
        int count = 0;
        while (lef<=rig){
            if(w[rig]<=rest[lef]){
                lef++;
            }
            rig--;
            count++;
        }
        System.out.println(count);
    }
}
