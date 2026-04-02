public class Search2D {

    public static boolean search(int[][] mat,int target){
        int m=mat.length;
        int n=mat[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row= mid/n;
            int col=mid%n;
            if(mat[row][col]==target){
                return true;
            }
            else if(mat[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][]mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println(search(mat, 13));
    }
}