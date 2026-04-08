

public class MaxnestingDepth {

    public static int max(String s){
        int count =0;
        int maxDepth=0;
for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    if(ch=='('){
        count++;
        maxDepth=Math.max(maxDepth, count);
    }
    else if (ch==')') {
        count--;
    }

}
return maxDepth;
    }
    public static void main(String[] args) {
        System.out.println(max("(1+(2*3)+((8)/4))+1"));
    }
}