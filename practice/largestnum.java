public class largestnum {

    public static int largest(int[] nums){
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(largest(nums));
    }
}