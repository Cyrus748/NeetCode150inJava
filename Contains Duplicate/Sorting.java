import java.util.Arrays;

public class Sorting {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    // public static void main(String[] args) {
    //     Sorting sorting = new Sorting();
    //     int[] nums = {1, 2, 3, 1};
    //     System.out.println(sorting.hasDuplicate(nums));
    // }
}