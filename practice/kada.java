public class kada {

    public static int algorithm(int[] nums){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            currentsum = Math.max(nums[i], currentsum + nums[i]);
            maxsum = Math.max(maxsum, currentsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4};
        System.out.println(algorithm(nums));
    }
}