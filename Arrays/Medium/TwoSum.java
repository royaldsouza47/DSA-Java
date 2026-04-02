import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] sum(int[] nums, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(map.containsKey(compliment)){
                 return new int[] {map.get(compliment),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums={1,6,10,3};
        int target=7;
        System.out.println(Arrays.toString(sum(nums, target)));
    }
}