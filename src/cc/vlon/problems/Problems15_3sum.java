package cc.vlon.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 *
 * @author Vincent
 */
public class Problems15_3sum {

    public static void main(String[] args) {
        Problems15_3sum solution = new Problems15_3sum();
        List<List<Integer>> threeSum = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        for (List<Integer> list : threeSum) {
            System.out.print("[ ");
            for (Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return result;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (right > left && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (right > left && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }

        return result;
    }

}