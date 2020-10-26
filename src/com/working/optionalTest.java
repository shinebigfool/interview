package com.working;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optionalTest {
    @Test
    public void test(){
        List<TCheckContent> list = new ArrayList<>();
        for(int i = 0;i<10;i++){
            TCheckContent t = new TCheckContent();
            t.setbType("0");
            t.setCheckId("1");
            t.setContent(i+":content");
            t.setId(String.valueOf(i));
            t.setPics("#ftp#/smartSite/2019/12/29/20191229112827789.png");
            t.setPrincipal("testPrincipal");
            list.add(t);
        }
        for (TCheckContent tCheckContent : list) {
            System.out.println(tCheckContent);
        }
        for (TCheckContent t : list) {
            Optional.ofNullable(t.getPics()).ifPresent(url -> {
                t.setPicUrls(Arrays.asList(url.split("11")));
            });
        }
        for (TCheckContent tCheckContent : list) {
            System.out.println(tCheckContent);
        }
    }

    @Test
    public void test1(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime pastDate = LocalDateTime.now().minus(30, ChronoUnit.DAYS);
        System.out.println(dtf.format(pastDate));
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().minus(1, ChronoUnit.DAYS));

        String startTime = dtf.format(LocalDateTime.now().minus(1, ChronoUnit.DAYS));
        String nowTime = dtf.format(LocalDateTime.now());
        System.out.println(startTime);
        System.out.println(nowTime);
        double per = 3.145428190412;
        System.out.println(new BigDecimal(per).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
    }
}
