import java.util.Arrays;

public class mergeSortedArrays {

    public static void merge(int[]arry1, int[]arry2, int n, int m){
        int left=n-1;
        int right=0;
        while(left>=0&& right<m){
            if(arry1[left]>arry2[right]){
                int temp=arry1[left];
                arry1[left]=arry2[right];
                arry2[right]=temp;
            }else{
                break;
            }
        }
        Arrays.sort(arry1);
        Arrays.sort(arry2);
    }
    public static void main(String[] args) {
        int[] arry1={1, 2, 5, 4};
        int[] arry2={3,6, 7};
        merge(arry1, arry2, 4, 3);
        System.out.println(Arrays.toString(arry1));
        System.out.println(Arrays.toString(arry2));
    }
}