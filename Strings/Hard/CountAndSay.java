package Hard;
public class CountAndSay {

    public static String count(int n){
        String result="1";
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            int j=0;
            while (j<result.length()) {
                char ch=result.charAt(j);
                int count=1;
                while (j+1<result.length()&& result.charAt(j+1)==ch) {
                    j++;
                    count++;
                }
                sb.append(count);
                sb.append(ch);
                j++;
            }
        result=sb.toString();
        }
        return result;
        
        

    }
    public static void main(String[] args) {
        System.out.println(count(1));
        System.out.println(count(2));
        System.out.println(count(3));
        System.out.println(count(4));
        System.out.println(count(5));
        System.out.println(count(6));
        System.out.println(count(7));
    }
}