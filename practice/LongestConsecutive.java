import java.util.HashSet;

public class LongestConsecutive {

    public static int longest(int[] nums){
        HashSet<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);

        }
        int maxLen=0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentLen=1;
                while (set.contains(currentNum+1)) {
                    currentNum++;
                    currentLen++;
                }
                maxLen=Math.max(maxLen, currentLen);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums={100,1,200,3,2,4};
        int resullt=longest(nums);
        System.out.println("longest Consecutive:"+resullt);

    }
}