package com.qaomuu.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 找到字符串中所有字母异位词
 *
 * @author Vincent
 */
public class Problems438_FindAllAnagramsInAString {

    public static void main(String[] args) {
        Problems438_FindAllAnagramsInAString solution = new Problems438_FindAllAnagramsInAString();
        List<Integer> integerList = solution.findAnagrams("abab", "ab");
        for (Integer i : integerList) {
            System.out.print(i + " ");
        }
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> resList = new ArrayList<>();
        if (s.length() < p.length()) {
            return resList;
        }

        int left = 0, right = p.length();

        char[] array = p.toCharArray();
        Arrays.sort(array);
        String pSort = new String(array);

        while(right <= s.length()) {
            String substring = s.substring(left, right);
            char[] array1 = substring.toCharArray();
            Arrays.sort(array1);
            if (pSort.equals(new String(array1))) {
                resList.add(left);
            }
            left++;
            right++;
        }
        return resList;
    }

}