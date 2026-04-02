import java.util.Arrays;

public class SetToZeroes {

    public static void set(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        boolean[] rows=new boolean[m];
        boolean[] cols=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    rows[i]=true;
                    cols[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rows[i]||cols[j]){
                    mat[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat={
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        
        set(mat);
        for(int i=0;i<mat.length;i++){
            System.out.println(Arrays.toString(mat[i]));
        }
}
}