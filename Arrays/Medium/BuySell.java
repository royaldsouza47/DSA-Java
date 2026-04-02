public class BuySell {

    public static int BS(int[] arry){
        int minPrice=arry[0];
        int maxPrice=0;
        for(int i=1;i<arry.length;i++){
            if(arry[i]<minPrice){
                minPrice=arry[i];
            }else{
                int profit=arry[i]-minPrice;
                if(profit>maxPrice){
                    maxPrice=profit;
                }
            }
        }
        return maxPrice;
    }
    public static void main(String[] args) {
        int[] arry={10,7,5,8,11,9};
        int result=BS(arry);
        System.out.println("Best Profit day:"+result);
    }
}