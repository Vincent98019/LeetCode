package com.qaomuu.problems;

/**
 * 找出字符串中第一个匹配项的下标
 *
 * @author Vincent
 */
public class Problems28_FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {
        Problems28_FindTheIndexOfTheFirstOccurrenceInAString solution = new Problems28_FindTheIndexOfTheFirstOccurrenceInAString();
        int i = solution.strStr("mississippi", "issipi");
        System.out.println(i);
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        char[] haystackCharArray = haystack.toCharArray();
        char[] needleCharArray = needle.toCharArray();

        loop:
        for (int i = 0; i < haystackCharArray.length; i++) {
            if (haystackCharArray.length - i < needleCharArray.length) {
                return -1;
            }
            for (int j = 0; j < needleCharArray.length; j++) {
                if (needleCharArray[j] != haystackCharArray[j + i]) {
                    continue loop;
                }
            }
            return i;
        }
        return -1;
    }

}