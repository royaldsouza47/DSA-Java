public class RemoveOutermostParentheses {

    public static String removeOuter(String s){
        int count=0;
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
if (ch=='(') {
    if(count>0){
        sb.append(ch);
    }
    count++;
}
else{
    count--;
    if (count>0) {
        sb.append(ch);
    }
}
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeOuter("()()(())"));
    }
}