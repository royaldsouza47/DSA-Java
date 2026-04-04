public class major {

    public static int maj(int[]nums){
        int canditate=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                canditate=num;
            }if(num==canditate){
                count++;

            }else{
                count--;
            }
        }
        return canditate;
    }
    public static void main(String[] args) {
        int[] nums={0,1,1,0,1,0,1};
        int resullt=maj(nums);
        System.out.println("Major Element:"+ resullt);
    }
}
