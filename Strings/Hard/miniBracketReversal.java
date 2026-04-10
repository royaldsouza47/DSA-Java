package Hard;
public class miniBracketReversal {

 public static int mini(String s){
    if(s.length()%2!=0) return -1;
    int open=0;
    int close=0;
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            open++;
        }
        if(ch==')'){
            if(open>0){
                open--;
            }else{
                close++;
            }
        }
    }
    return (open+1)/2 + (close+1)/2;
 }
 public static void main(String[] args) {
    System.out.println(mini(")(())((("));
 }
}