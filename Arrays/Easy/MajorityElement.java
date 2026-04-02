public class MajorityElement {

    public static int maj(int[] nums){
        int candidate=0;
        int count=0;
        for(int num:nums){
            if(num==candidate){
                count++;
            }else if(count==0){
                candidate=num;
                count=1;
            }else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] nums={0,7,7,7,0,7};
        int result=maj(nums);
        System.out.println("Majority Elements:"+ result);
    }
}