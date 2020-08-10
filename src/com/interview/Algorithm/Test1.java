package com.interview.Algorithm;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < m; i++) {
            Set<Integer> set = new HashSet<>();
            String num = sc.nextLine();
            int target = operate(num);
            set.add(target);
            boolean judge = true;
//            System.out.println(target);
            while (target!=1){
                target = operate(String.valueOf(target));
                if(!set.add(target)){
//                    System.out.println(target);
                    judge = false;
                    break;
                }
//                System.out.println(target);
            }
            System.out.println(judge);
        }
    }
    public static int operate(String a){
        int sum=0;
        for (int i = 0; i < a.length(); i++) {
            sum+=Math.pow(a.charAt(i)-'0',2);
        }
        return sum;
    }
}
