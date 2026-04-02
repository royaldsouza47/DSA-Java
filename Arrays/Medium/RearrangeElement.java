public class RearrangeElement {

    public static int[] rearrange(int[] nums){
        int n=nums.length;
        int []result=new int[n];
        int posIndex=0;
        int negIndex=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                result[posIndex]=nums[i];
                posIndex+=2;
            }else{
                result[negIndex]=nums[i];
                negIndex+=2;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={2, 4, 5, -1, -3, -4};
        int[]answer=rearrange(nums);
        for(int num:answer){
            System.out.print(num + " ");
        }
    }
}