import java.util.Arrays;

public class rotatematrix {
    public static void rotate(int[][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int left=0;
        int right=matrix.length-1;
        while (left<=right) {
            for(int i=0;i<n;i++){
            int temp=matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=temp;
            }
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotate(matrix);
        for(int i=0;i<matrix.length;i++){
        System.out.println(Arrays.toString(matrix[i]));
        }
    }
    
}
