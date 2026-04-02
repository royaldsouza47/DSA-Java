import java.util.ArrayList;
import java.util.List;
public class majority3 {

    public static List<Integer> maj(int[] nums){
        int canditate1=0, count1=0;
        int candidate2=0, count2=0;
        for(int num: nums){
            if(num==canditate1){
                count1++;
            }else if(num==candidate2){
                count2++;
            }else if(count1==0){
                canditate1=num;
                count1=1;
            }else if(count2==0){
                candidate2=num;
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num: nums){
            if(num==canditate1){
                count1++;
            }else if(num==candidate2){
                count2++;
            }
        }
        List<Integer> result= new ArrayList<>();
        if(count1>nums.length/3) result.add(canditate1);
        if(count2>nums.length/3) result.add(candidate2);
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,2,3,3};
        System.out.println(maj(nums));

    }
}