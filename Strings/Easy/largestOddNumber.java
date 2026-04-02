public class largestOddNumber {

    public static String largest(String str){
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if((ch-'0'%2!=0)){
                return str.substring(0,i+1);
            }
            
        }
        return "";
    }
    public static void main(String[] args) {
        String str="54367";
        System.out.println(largest(str));
    }
}