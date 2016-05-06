package com.dyh.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        System.out.println(map.put("1", "2"));
        System.out.println(map.put("1", "3"));

        for (Entry<String, String> entry : map.entrySet()) {

        }

        System.out.println(3 & 1);

    }
}
