package com.ThirdDivide;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import java.util.*;

public class D8_11_9 {
    public static void main(String[] args) {
        String a = "catsanddog";
        Set<String> dict = new HashSet<>();
        dict.add("cat");
        dict.add("cats");
        dict.add("and");
        dict.add("sand");
        dict.add("dog");
        ArrayList<String> result = new ArrayList<>();
        dp(a,dict,0,a.length(),result);
        for (ArrayList arrayList : set) {
            System.out.println(arrayList.toString());
        }
        HashMap map = new HashMap();
    }
    public static Set<ArrayList> set = new HashSet<>();
    public static void dp(String a, Set<String> dict,int first,int n,ArrayList<String> arrayList){

        if(first==n){
            set.add(arrayList);
            return;
        }

        for (String s : dict) {
            if(a.indexOf(s,first)==first){
                arrayList.add(s);
                dp(a,dict,first+s.length(),n,arrayList);
            }
        }
    }
    static boolean c;
    @Test
    public void test(){
        System.out.println(17^5);
        int i = 5;
        int j = 10;
        System.out.println(i + ~j);
        Hashtable hashtable = new Hashtable();
        hashtable.put(1,1);
    }



}
