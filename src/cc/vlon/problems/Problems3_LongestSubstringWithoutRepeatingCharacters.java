package cc.vlon.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串
 *
 * @author Vincent
 */
public class Problems3_LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        Problems3_LongestSubstringWithoutRepeatingCharacters solution = new Problems3_LongestSubstringWithoutRepeatingCharacters();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution.lengthOfLongestSubstring("qrsvbspk"));
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        char[] array = s.toCharArray();
        int j = -1;
        for (char c : array) {
            while (set.contains(c)) {
                set.remove(array[++j]);
            }
            set.add(c);
            result = Math.max(result, set.size());
        }
        return result;
    }

}