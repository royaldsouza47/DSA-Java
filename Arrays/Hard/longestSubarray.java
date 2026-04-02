import java.util.HashMap;

public class longestSubarray {

    public static int longest(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                maxlen=Math.max(maxlen, i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] nums={10,5,2,7,1,9};
        int k=15;
        System.out.println(longest(nums, k));
    }
}