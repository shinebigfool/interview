package com.interview.Program;

import java.util.*;

public class D8_7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputS = sc.nextLine();
        String inputDict = sc.nextLine();
        String s = inputS.substring(inputS.indexOf("\"")+1,inputS.lastIndexOf("\""));
        String dictL = inputDict.split("=")[1];
        String[] dictN = dictL.split(",");
        Set<String> dict = new HashSet<>();
        for (String value : dictN) {
            dict.add(value.substring(value.indexOf("\"") + 1, value.lastIndexOf("\"")));
        }
        ArrayList<String> result = wordBreak(s,dict);
        System.out.print("[");
        for (int i = 0; i < result.size()-1; i++) {
            System.out.print(result.get(i)+", ");
        }
        System.out.print(result.get(result.size()-1)+"]");

    }
    public static ArrayList<String> wordBreak(String s, Set<String> dict) {
        return DFS(s,dict,new HashMap<String, ArrayList<String>>());
    }
    //DFS递归思路
    private static ArrayList<String> DFS(String s,Set<String> dict,HashMap<String,ArrayList<String>> map){
        if(map.containsKey(s)){
            return map.get(s);
        }
        ArrayList<String> res = new ArrayList<String>();
        if(s.length()==0){
            res.add("");
            return res;
        }
        for(String str:dict){
            if(s.startsWith(str)){
                for(String subStr : DFS(s.substring(str.length()),dict,map)){
                    res.add(str+(subStr ==""?"":" ")+subStr);
                }
            }
        }
        map.put(s,res);
        return res;
    }
}
