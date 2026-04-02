public class largestElement{
 public static int findLargest(int[] nums){
    int max=nums[0];
    for(int i=1; i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
    }
   return max;
}
   public static void main(String[] args){
    int[] nums={1,2,3,4};
    System.out.println(findLargest(nums));
   
}
}