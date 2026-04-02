public class KadanesAlgorithm {

    public static int largest(int[] nums){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currentsum+=nums[i];
            if(currentsum>maxsum){
                maxsum=currentsum;
            }if(currentsum<0){
            currentsum=0;
        }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums={-1,-2,-3,-4};
        int result=largest(nums);
        System.out.println("Largest subarray:"+ result);
    }
}