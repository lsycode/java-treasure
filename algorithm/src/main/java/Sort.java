import tools.T;

/**
 * Created by lsy on 2016/4/28.
 */
public class Sort {
    int[] nums;
    int len;

    public Sort(int[] nums) {
        this.nums = nums;
        this.len = nums.length;
    }

    public void bubble() {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void bubble2() {
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(j, j - 1);
                }
            }
        }
    }

    public void quick() {
        quick(0, len - 1);
    }

    private void quick(int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left, j = right;
        while (i < j) {
            while (nums[j] >= nums[left] && i < j) {
                j--;
            }
            while (nums[i] <= nums[left] && i < j) {
                i++;
            }
            if (i < j) {
                swap(i, j);
            }
        }
        swap(left, i);
        quick(left, i - 1);
        quick(i + 1, right);
    }


    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4, 6, 2, 3, 5, 6, -3, 4, 6, 7, 4};
        Sort b = new Sort(nums);
        b.quick();
        T.outInt(b.nums);
    }
}
