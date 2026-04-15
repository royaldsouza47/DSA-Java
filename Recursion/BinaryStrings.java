import java.util.ArrayList;
import java.util.List;

public class BinaryStrings {

    public static List<String> generateString(int n){
        List<String> result= new ArrayList<>();
        solve(n,"",result);
        return result;
    }
    public static void solve(int n, String current,List<String> result){
if(current.length()==n){
    result.add(current);
    return;
}
solve(n, current+"0", result);
if(current.isEmpty()|| current.charAt(current.length()-1)!=1){
    solve(n, current+"1", result);
}
    }
    public static void main(String[] args) {
        
        System.out.println(generateString(3));
    }
}