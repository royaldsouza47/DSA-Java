import java.util.*;
public class leader {

    public static List<Integer> lead(int[] nums){
        List<Integer> Leader=new ArrayList<>();
        int maxCount=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>maxCount){
                Leader.add(nums[i]);
                maxCount=nums[i];

            }
          
        }
         Collections.reverse(Leader); 
        
        return Leader;
    }
    public static void main(String[] args) {
        int[] main={1,2,5,3,1,2};
        List<Integer> result=lead(main);
        System.out.println("Leaders in a Array:"+result);
    }
}