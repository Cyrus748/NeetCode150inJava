import java.util.Arrays;

public class HashSetLength {
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    // public static void main(String[] args) {
    //     HashSetLength hashSetLength = new HashSetLength();
    //     int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    //     System.out.println(hashSetLength.hasDuplicate(nums));
    // }
}
