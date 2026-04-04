public class consecOnes {

    public static int Ones(int[] nums){
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
        int[] nums={0,1,1,0,0,1,1,1,1,0};
        int result=Ones(nums);
        System.out.println("Consecutive Ones:"+ result);
    }
}