package leetCode;

/**
 * Created by lsy on 2016/4/23.
 */
public class HouseRobber198 {
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxA = 0;
        int maxB = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = maxB;
            maxB = Math.max(nums[i] + maxA, maxB);
            maxA = temp;
        }
        return maxB;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1};
        System.out.println(rob(nums));
    }
}
