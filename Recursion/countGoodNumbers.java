public class countGoodNumbers {

     static long MOD = 1000000007;
     public static long countgood(long n){
        long evencount=(n+1)/2;
        long oddcount=n/2;
        long result=(fastpow(5,evencount)*fastpow(4,oddcount))%MOD;
        return result;

     }
     public static long fastpow(long base, long exp){
        if(exp==0) return 1;
        long half=fastpow(base, exp/2);
        if(exp%2==0){
            return (half*half)%MOD;
        }else{
            return (half*half%MOD*base)%MOD;
        }
     }
     public static void main(String[] args) {
        System.out.println(countgood(4));
     }
}