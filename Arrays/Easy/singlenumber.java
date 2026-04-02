public class singlenumber {

    public static int single(int[] nums){
        int result=0;
        for(int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={0,0,1,1,2,2,3};
        System.out.println(single(nums));
    }
}