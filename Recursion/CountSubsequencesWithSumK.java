

public class CountSubsequencesWithSumK {
    public static int count(int[] nums,int k){
        return solve(nums,0,k);
    
    }
    public static int solve(int[] nums, int index, int remaining){
        if(index==nums.length){
            if(remaining==0){
                return 1;
            }else{
                return 0;
            }
        }
        int include=solve(nums, index+1, remaining-index);
        int exclude=solve(nums, index+1, remaining);
        return include+exclude;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(count(nums, 3));
    }
    
}
