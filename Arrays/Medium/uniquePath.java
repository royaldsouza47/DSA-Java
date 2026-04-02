public class uniquePath {

    public static int unique(int m, int n){
        int N=m+n-2;
        int r=n-1;
        long res=1;
        for(int i=1;i<=r;i++){
            res=res*(N-r+i)/i;

        }
        return(int) res;
    }
    public static void main(String[] args) {
        int m=2;
        int n=3;
       int result= unique(m, n);
        System.out.println("Unique paths are:"+ result);
    }
}