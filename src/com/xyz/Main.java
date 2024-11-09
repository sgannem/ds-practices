package com.xyz;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(countString("hellllllllllloooooo"));
    }

    public static String countString(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        Map<Character, Integer> charFrequencyMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue)->oldValue, LinkedHashMap::new));
        StringBuilder sb = new StringBuilder();
        for(Map.Entry m: charFrequencyMap.entrySet()) {
            sb.append(m.getKey()).append(m.getValue());
        }
        return sb.reverse().toString();
    }


//    public static String countString(String str) {
//        Map<Character, Integer> map = new HashMap<>();
//        for(char ch: str.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0)+1);
//        }
//        Map<Character, Integer> output = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
//                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue)-> oldValue, LinkedHashMap::new));
//        System.out.println(output);
//        StringBuilder sb = new StringBuilder();
//        for(Map.Entry<Character, Integer> t: output.entrySet()) {
//            sb.append(t.getKey()).append(t.getValue());
//        }
//        return sb.toString();
//    }
}