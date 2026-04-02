public class LongestCommonPrefix {

    public static String pre(String[] str){
        if(str.length==0) return "";
        String prefix=str[0];
        for(int i=1;i<str.length;i++){
            while (!str[i].startsWith(prefix)) {
                prefix=prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty()) return "";
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] str={"flowers","flow","fly","flight"};
        System.out.println(pre(str));
    }
}