public class rotatek {

    public static void rotate(int[] nums,int k){
        for(int step=0;step<k;step++){
            int first=nums[0];
            for(int i=1;i<nums.length;i++){
                nums[i-1]=nums[i];

            }
            nums[nums.length-1]=first;
        }
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums, k);
        for(int num:nums)
            System.out.print(num + " ");
    }
}