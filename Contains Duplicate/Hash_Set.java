import java.util.*;

public class Hash_Set {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    // public static void main(String[] args) {
    //     Hash_Set hs = new Hash_Set();
    //     int[] nums = {1, 2, 3, 1};
    //     System.out.println(hs.hasDuplicate(nums));
    // }
}