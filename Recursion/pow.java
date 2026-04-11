public class pow {

    public static double mypow(double x,int n){
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        return fastpow(x,N);
    }
    public static double fastpow(double x,long n){
        if(n==0) return 1.0;
        double half=fastpow(x, n/2);
        if (n%2==0) {
            return half*half;
        }else{
            return half * half*x;
        }
    }
    public static void main(String[] args) {
        System.out.println(mypow(2, 10));
    }
}