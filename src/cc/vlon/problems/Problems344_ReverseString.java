package cc.vlon.problems;

/**
 * 反转字符串
 *
 * @author Vincent
 */
public class Problems344_ReverseString {

    public static void main(String[] args) {
        Problems344_ReverseString solution = new Problems344_ReverseString();
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);

        System.out.print("[ ");
        for (char c : s) {
            System.out.print(c + " ");
        }
        System.out.println("]");
    }

    public void reverseString(char[] s) {
        if (s.length == 1) {
            return;
        }
        int left = 0;
        int right = s.length - 1;

        while (right > left) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

    }

}