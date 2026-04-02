import java.util.*;
public class SpatialMatrix {

    public static List<Integer> Matrix(int[][] matrix){
    int top=0;
    int bottom=matrix.length-1;
    int left=0;
    int right=matrix[0].length-1;
    List<Integer> result=new ArrayList<>();
    while(left<=right&& top<=bottom){
    for(int i=left;i<=right;i++){
    result.add(matrix[top][i]);
    }
    top++;
    for(int i=top;i<=bottom;i++){
        result.add(matrix[i][right]);
    }
    right--;
    if(left<=right){
        for(int i=right;i>=left;i--){
            result.add(matrix[bottom][i]);
        }
        bottom--;
    }
    if(top<=bottom){
        for(int i=bottom;i>=top;i--){
            result.add(matrix[i][left]);
        }
        left++;
    }
    
    }
    return result;
}

        
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        List<Integer> result=Matrix(matrix);
        System.out.print("Spatial Matrix:"+ result);

}
}