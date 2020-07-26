package com.company;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        new Sort().sort(arr);
    }
    public void sort(int[] arr){
        int length = arr.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int value : arr) {
            System.out.print(value + ",");
        }
    }
}
