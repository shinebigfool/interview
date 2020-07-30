package com.interview.Algorithm;

import org.junit.Test;

import java.util.*;

public class ArrayOperate {
    //暴力穷举求和最大的子序列
    @Test
    public void test1(){
        int[] nums = {-1,-2,1,6,-2,1,5,-10};
        int step = 1;
        int maxSum = 0;
        int start = 0;
        int end = 0;
        while (step<=nums.length){
            for (int i=0;i<=nums.length-step;i++){
                int tempSum = nums[i];
                for (int j = i+1;j<i+step;j++){
                    tempSum+=nums[j];
                }
                if(tempSum>=maxSum){
                    start = i;
                    end = i+step-1;
                    maxSum = tempSum;
                }
            }
            step++;
        }
        System.out.println(maxSum+";start="+start+";end="+end);
    }
    //动态规划求和最大的子序列
    @Test
    public void test2(){
        int[] nums = {-1,-2,1,6,-2,1,5,-10};
        int max = nums[0];
        int[] sums = new int[nums.length];//以i结尾的最大子序列的和
        sums[0]=nums[0];
        int end = 0;
        int startId = 0;
        int[] start = new int[nums.length];//以i结尾的最大子序列开始角标
        for(int i = 1;i<nums.length;i++){
            if(sums[i-1]>0){
                sums[i]=sums[i-1]+nums[i];
                start[i]=start[i-1];
            }else {
                sums[i]=nums[i];
                start[i]=i;
            }
            if(sums[i]>max){
                max = sums[i];
                end = i;
                startId = start[i];
            }
        }
        System.out.println(max+";start:"+startId+";end:"+end);
    }
    //一组数字串，没有重复的升序打印
    @Test
    public void test3(){
        int[] nums = {1,3,5,2,2,1,4,6,8,8,7,9};
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
    //冒泡排序
    @Test
    public void test3_1(){
        int[] nums = {1,3,5,2,2,1,4,6,8,8,7,9};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]){
                System.out.print(nums[i]);
                System.out.print(",");
            }
        }
        System.out.print(nums[nums.length-1]);
    }
    //一组有序数字串，没有重复的升序打印
    @Test
    public void test4(){
        int[] nums = {1,1,2,3,4,4,6,7,7,8,8,9,9};
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]){
                System.out.print(nums[i]);
                System.out.print(",");
            }
        }
        System.out.print(nums[nums.length-1]);
    }
    @Test
    public void test4_1(){
        int[] nums = {1,1,2,3,4,4,6,7,7,8,8,9,9};
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.add(num)) {
                System.out.print(num);
                System.out.print(",");
            }
        }
    }
    //带序号的冒泡排序
    @Test
    public void test5(){
        int[] nums = {1,3,5,2,2,1,4,6,8,8,7,9};
        int[] index = new int[nums.length];
        for (int i = 0; i < index.length; i++) {
            index[i]=i+1;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    temp=index[i];
                    index[i] = index[j];
                    index[j]=temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+"index："+index[i]);
        }
    }
    @Test
    public void test6(){
        int[] nums = {1,3,5,2,2,1,4,6,8,8,7,9};
        Integer[] target = new Integer[nums.length];
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int num : nums) {
            if(num%2==0){
                list2.add(num);
            }else {
                list1.add(num);
            }
        }
        list1.addAll(list2);
        list1.toArray(target);
        System.out.println(Arrays.toString(target));
    }
}
