package com.qaomuu.problems;

import java.util.*;

/**
 * 字母异位词分组
 *
 * @author Vincent
 */
public class Problems49_GroupAnagrams {

    public static void main(String[] args) {
        Problems49_GroupAnagrams solution = new Problems49_GroupAnagrams();
        List<List<String>> groupAnagrams = solution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        for (List<String> list : groupAnagrams) {
            System.out.print("[ ");
            for (String num : list) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array).intern();
            List<String> list = map.computeIfAbsent(key, k -> new ArrayList<>());
            list.add(str);
        }
        return new ArrayList<>(map.values());
    }

}