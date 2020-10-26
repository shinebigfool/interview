package com.working;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateTest {
    @Test
    public void test(){
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = sd.format(new Date());
        String day = "am" + date.substring(8, 10);
        String day1 = "pm" + date.substring(8, 10);
        System.out.println(day);
        System.out.println(day1);
    }
    @Test
    public void listTest(){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        System.out.println(list.contains(3));
        System.out.println(list.contains(1));
    }
}
