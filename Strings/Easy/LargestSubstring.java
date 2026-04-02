public class LargestSubstring {

    public String large(String s){
        if(s==null||s.length()==0){
            return "";
        
        }int rightindex=-1;
        for(int i=s.length()-1;i>=0;i--){
            int digit=s.charAt(i)-'0';
            if(digit %2!=0){
                rightindex=i;
                break;
            }
        }if(rightindex==-1){
            return "";
        }
        String result=s.substring(0,rightindex+1);
        int start=0;
        while (start<result.length()&& result.charAt(start)=='0') {
            start++;
        }return start==result.length()?"" :result.substring(start);
    }
    public static void main(String[] args) {
        LargestSubstring obj=new LargestSubstring();
        String input="0001235";
        System.out.println(obj.large(input));
    }
}