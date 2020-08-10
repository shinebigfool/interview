package com.interview.SecondWeek;

public class Test {

    public static Test t1=new Test();
    static {
        System.out.println("blockB");
    }

    {
        System.out.println("blockA");
    }
    Test(){
        System.out.println("newTest");
    }


    public static void main(String[] args){
        Test t2=new Test();
        System.out.println(Math.pow(2,13));
    }
}
