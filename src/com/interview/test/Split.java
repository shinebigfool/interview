package com.interview.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "";

        if (input.hasNextLine()) {
            str = input.nextLine();
        }

        if ("".equals(str) || str.length() < 4) {
            System.out.println(0);
            return;
        }

        char[] chars = str.substring(0, 4).replace(" ", "").toCharArray();
        String optStr = str.substring(4);

        // 键值对的字符串数组
        String[] splitOptStr = optStr.split(chars[0] + "");
        if (splitOptStr.length < 1) {
            System.out.println(0);
            return;
        }
        List<String> strings = new ArrayList<String>();

        for (String s : splitOptStr) {
            // 键值对
            String[] split = s.split(chars[1] + "");
            if (split.length > 1) {
                if ("".equals(split[0]) && "".equals(split[1])) {

                } else {
                    strings.add(split[0] + " " + split[1]);
                }
            }

        }

        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
