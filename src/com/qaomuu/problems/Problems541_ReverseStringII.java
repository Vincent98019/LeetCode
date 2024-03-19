package com.qaomuu.problems;

/**
 * 反转字符串 II
 *
 * @author Vincent
 */
public class Problems541_ReverseStringII {

    public static void main(String[] args) {
        Problems541_ReverseStringII solution = new Problems541_ReverseStringII();
        String s = "abcdefg";
        String result = solution.reverseStr(s, 2);
        System.out.print(result);
    }

    public String reverseStr(String s, int k) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i = i + k * 2) {
            int left = i;
            int right = left + k -1;
            if (right >= array.length) {
                right = array.length - 1;
            }
            while (right > left) {
                array[left] ^= array[right];
                array[right] ^= array[left];
                array[left] ^= array[right];
                right--;
                left++;
            }
        }
        return new String(array);
    }

}