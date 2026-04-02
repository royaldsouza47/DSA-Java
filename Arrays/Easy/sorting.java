public class sorting {
    public static boolean sort(int[] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        System.out.println(sort(nums));
    }
}
