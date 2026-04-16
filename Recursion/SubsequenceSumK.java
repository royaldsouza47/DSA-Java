public class SubsequenceSumK {

    public static boolean hasSubsequence(int[] nums, int k) {
        return solve(nums, 0, k);
    }

    public static boolean solve(int[] nums, int index, int remaining) {

        // Base case: remaining is 0 → found it!
        if (remaining == 0) return true;

        // Base case: reached end without hitting 0
        if (index == nums.length) return false;

        // Choice 1: TAKE current element
        if (solve(nums, index + 1, remaining - nums[index])) {
            return true;
        }

        // Choice 2: SKIP current element
        return solve(nums, index + 1, remaining);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(hasSubsequence(nums, 8));  // true
        System.out.println(hasSubsequence(nums, 20)); // false
    }
}