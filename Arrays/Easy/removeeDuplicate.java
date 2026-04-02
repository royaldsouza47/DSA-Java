public class removeeDuplicate {

    public static int removee(int[] nums){
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] != nums[i]){
            nums[k]=nums[i];
            k++;
            }
        
    }
    return k;
}
    public static void main(String[] args){
        int[] nums={0,0,0,3,2,2,3};
        int k=removee(nums);
        
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+ " ");
    }
}

}