public class maxones {

    public static int ones(int[] nums){
        int currentStreak=0;
        int maxStreak=0;
        for(int num:nums){
            if(num==1){
                currentStreak++;
                maxStreak=Math.max(currentStreak, maxStreak);
            }else{
                currentStreak=0;
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
        int[] nums={1,0,0,0,1,1,1,1,0};
        int result=ones(nums);
        System.out.println("Consecutive Ones:"+ result);
    }
}