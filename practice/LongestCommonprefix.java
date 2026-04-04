public class LongestCommonprefix {

    public static String longest(String[] str){
        if(str.length==0) return"";
        String prefix=str[0];
        for(int i=0;i<str.length;i++){
            while (!str[i].startsWith(prefix)) {
                prefix=prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty()) return "";
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] str={"flower","rofl"};
        System.out.println(longest(str));
    }
}