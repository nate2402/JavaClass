package org.dimigo.collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        // Map (key, value로 구성) (key: unique, value: 상관X)
        Map<String, Integer> map = new HashMap<>(); //<key의 형태, value의 형태>

        map.put("kor", 100);
        map.put("mat", 100);
        map.put("eng", 100);

        printMap(map);

        map.remove("eng");
        printMap(map);
        map.clear();
        printMap(map);

        // HashMap (key: String, value : List<String>)
        Map<String, List<String>> map2 = new HashMap<>();

        //ArrayList (Map<String, String>)
        List<Map<String, String>> list = new ArrayList<>();
    }

    private static void printMap(Map<String, Integer> map) {
        for(String key : map.keySet()) {
            System.out.print(key + " : " + map.get(key) + " | ");
        }
        System.out.println();
    }
}