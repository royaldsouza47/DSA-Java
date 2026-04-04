public class secondLargest {

    public static int second(int[] nums){
        int max1;
        int max2;
        if(nums[0]>nums[1]){
            max1=nums[0];
            max2=nums[1];
        }else{
            max1=nums[1];
            max2=nums[2];
        }
        for(int i=2;i<nums.length;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>max2){
                max2=nums[i];

            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        int resullt=second(nums);
        System.out.println("Second Largest:"+ resullt);
    }
}