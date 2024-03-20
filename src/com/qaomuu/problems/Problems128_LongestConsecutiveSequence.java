package com.qaomuu.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * 最长连续序列
 *
 * @author Vincent
 */
public class Problems128_LongestConsecutiveSequence {

    public static void main(String[] args) {
        Problems128_LongestConsecutiveSequence solution = new Problems128_LongestConsecutiveSequence();
        int result = solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
        System.out.println(result);
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int result = 0;
        for (Integer num : set) {
            int a = num;
            if (!set.contains(a - 1)) {
                int temp = 1;
                while (set.contains(++a)) {
                    temp++;
                }
                result = Math.max(result, temp);
            }
        }
        return result;
    }

}