package com.qaomuu.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 四数之和
 *
 * @author Vincent
 */
public class Problems18_4sum {

    public static void main(String[] args) {
        Problems18_4sum solution = new Problems18_4sum();
        List<List<Integer>> threeSum = solution.fourSum(new int[]{-2, -1, -1, 1, 1, 2, 2}, 0);

        for (List<Integer> list : threeSum) {
            System.out.print("[ ");
            for (Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int j = 0; j < nums.length; j++) {
            if (j > 0 && nums[j] == nums[j - 1]) {
                continue;
            }

            for (int i = j + 1; i < nums.length; i++) {
                if (i > j + 1 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i + 1;
                int right = nums.length - 1;
                while (right > left) {
                    long sum = (long) nums[j] + nums[i] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        result.add(Arrays.asList(nums[j], nums[i], nums[left], nums[right]));

                        while (right > left && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        while (right > left && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        right--;
                        left++;
                    }
                }

            }
        }
        return result;
    }

}