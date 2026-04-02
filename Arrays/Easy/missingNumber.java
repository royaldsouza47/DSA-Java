public class missingNumber {
    public static int missing(int[] nums){
        int n=nums.length;
        int expected= n*(n+1)/2;
        int actualsum=0;
        for(int i=0;i<n;i++){
            actualsum+=nums[i];

        }
        return expected-actualsum;
    }
   public static void main(String[] args){
    int[] nums= {0,1,2,3,4};
    System.out.println(missing(nums));
   }

}
