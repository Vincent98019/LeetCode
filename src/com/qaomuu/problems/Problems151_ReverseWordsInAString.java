package com.qaomuu.problems;

/**
 * 反转字符串中的单词
 *
 * @author Vincent
 */
public class Problems151_ReverseWordsInAString {

    public static void main(String[] args) {
        Problems151_ReverseWordsInAString solution = new Problems151_ReverseWordsInAString();
        String s = "  hello world  ";
        String result = solution.reverseWords(s);
        System.out.print(result);
    }

    public String reverseWords(String s) {
        char a = ' ';
        int left = s.length() - 1, right = left;

        StringBuilder result = new StringBuilder();
        while (left >= 0) {
            while (right >= 0 && s.charAt(right) == a) {
                right--;
            }
            left = right;
            while (left >= 0 && s.charAt(left) != a) {
                left--;
            }
            int len = right - left;
            if (len == 0) {
                break;
            }
            char[] arr = new char[len];
            for (int i = 0; i < len; i++) {
                arr[i] = s.charAt(i + left + 1);
            }
            result.append(new String(arr)).append(a);
            right = left;
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

}