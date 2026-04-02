public class pascalTriangle {

    public static int pas(int r, int c){
        int n=r-1;
        int k=c-1;
        long result=1;
        for(int i=0;i<k;i++){
            result=result*(n-i);
            result=result/(i+1);
        }
        return (int) result;
    }
    public static void main(String[] args) {
        int r=4;
        int c=2;
        System.out.println(pas(r, c));
    }
}