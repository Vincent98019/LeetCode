package com.qaomuu.problems;

/**
 * 盛最多水的容器
 *
 * @author Vincent
 */
public class Problems11_ContainerWithMostWater {

    public static void main(String[] args) {
        Problems11_ContainerWithMostWater solution = new Problems11_ContainerWithMostWater();
        int result = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(result);
    }

    public int maxArea(int[] height) {
        int result = 0;

        int left = 0, right = height.length - 1;

        while (left < right) {
            int min = Math.min(height[left], height[right]);
            result = Math.max(result, min * (right - left));

            if (min == height[left]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

}