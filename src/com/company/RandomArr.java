package com.company;


public class RandomArr {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i=0;i<100;i++){
            arr[i]=i;
        }
        int length = arr.length;//初始化测试数组

        int[] index = new RandomArr().randomArr(length);//随机索引值
        for (int i=0;i<length;i++){
            System.out.print(arr[index[i]]+",");//打印结果
        }
        Sort s = new Sort();
        System.out.println("");
        s.sort(index);
    }
    public int[] randomArr(int length){
        int[] index = new int[length];
        for(int i=0;i<length;i++){
            index[i]=i;
        }
        double[] temp = new double[length];
        for(int i=0;i<length;i++){
            temp[i]=Math.random();//生成随机数列
        }
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-1-i;j++){
                if(temp[j]>temp[j+1]){
                    double t = temp[j];
                    temp[j]=temp[j+1];
                    temp[j+1]=t;

                    int Index = index[j];
                    index[j]=index[j+1];
                    index[j+1]=Index;//生成随机索引值
                }
            }
        }
        return index;
    }
}
