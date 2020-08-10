package com.interview.SecondWeek;


import java.util.*;

class Order{
    public int num;
    public int in;
    public int out;

    public Order(int num, int in, int out) {
        this.num = num;
        this.in = in;
        this.out = out;
    }

    @Override
    public String toString() {
        return "Order{" +
                "num=" + num +
                ", in=" + in +
                ", out=" + out +
                '}';
    }
}
public class D8_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int[] input = new int[3];
            for (int i1 = 0; i1 < 3; i1++) {
                input[i1] = sc.nextInt();
            }
            Order o = new Order(input[0],input[1],input[2]);
            orders.add(o);
        }
        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                Integer in1 = o1.in;
                Integer in2 = o2.in;
                return in1.compareTo(in2);
            }
        });
        int index=0;
        if(orders.get(N-1).in<=A){
            index = N-1;
        }
        else {
            for (int i = 0; i < N; i++) {
                if(orders.get(i).in>A){
                    index = i;
                    break;
                }
            }
        }


        //System.out.println("index:"+index);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < index; i++) {
            if(orders.get(i).out>=A){
                result.add(orders.get(i).num);
            }
        }
        if(orders.get(index).in<=A&&orders.get(index).out>=A){
            result.add(orders.get(index).num);
        }
        result.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        if(result.size()==0){
            System.out.println("null");
            return;
        }
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}
