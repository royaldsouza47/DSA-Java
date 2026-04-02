public class rotateleft {

    public static void rotate(int[] nums){
        int first = nums[0];

        for(int i=1; i<nums.length; i++){
            nums[i-1] = nums[i];   // only shifting inside loop
        }

        nums[nums.length-1] = first;   // put first at end AFTER loop
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        rotate(nums);
        for(int num: nums)
            System.out.print(num+ " ");
    }
}