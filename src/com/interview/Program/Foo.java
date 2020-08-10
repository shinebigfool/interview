package com.interview.Program;

import java.util.HashMap;
import java.util.Map;

public class Foo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 127);
        map.put("b", new Integer(127));
        map.put(null, null);
        System.out.println(map.get("a") == (map.get("b")));
        // 5  }
        int arr[] = {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

