package cc.vlon.problems;

/**
 * 盛最多水的容器
 *
 * @author Vincent
 */
public class Problems42_TrappingRainWater {

    public static void main(String[] args) {
        Problems42_TrappingRainWater solution = new Problems42_TrappingRainWater();
        int result = solution.trap(new int[]{0, 7, 1, 4, 6});
        System.out.println(result);
    }

    public int trap(int[] height) {
        int result = 0;
        int left = 0, right = height.length - 1;

        int leftMax = 0, rightMax = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (height[left] < height[right]) {
                result += leftMax - height[left];
                left++;
            } else {
                result += rightMax - height[right];
                right--;
            }
        }

        return result;
    }

}