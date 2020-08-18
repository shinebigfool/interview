package com.ThirdDivide;

import org.junit.Test;

import java.util.*;

public class D8_11_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            long[] sum = new long[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
                sum[i] = nums[i];
            }

            int[] count = new int[n];
            sum[0] = nums[0];
            Arrays.fill(count,1);
            int max = 0;
            for (int i = 1; i < n; i++) {
                if(nums[i]>=sum[i-1]){
                    sum[i] = nums[i]+sum[i-1];
                    count[i] = count[i-1]+1;
                    if(count[i]>max){
                        max = count[i];
                    }
                }
            }
            System.out.println(max);
        }
    }
    @Test
    public void te() {
        List  Listlist1 = new ArrayList();
        Listlist1.add(0);
        List Listlist2 = Listlist1;
        System.out.println(Listlist1.get(0) instanceof Integer);
        System.out.println(Listlist2.get(0) instanceof Integer);
        int a = '2';
        System.out.print(a);

    }

}
