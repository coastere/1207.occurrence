package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []arr = {1,2};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if (hm.containsKey(arr[i])) {
                hm.replace(arr[i], hm.get(arr[i]) + 1);
            } else hm.put(arr[i], 1);
        }

        for (int i:hm.keySet()             ) {
            System.out.println(i+":"+hm.get(i));
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i:hm.values()             ) {
            hs.add(i);
        }

        if (hs.size() == hm.size()) {
            System.out.println("true");
        }else System.out.println("false");




    }
}
