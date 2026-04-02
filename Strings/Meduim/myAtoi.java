public class myAtoi {
public static int atoi(String s){
    int i=0;
    int n=s.length();
    int sign=1;
    long num=0;
    while (i<n&& s.charAt(i)==' ') {
        i++;
    }
    if(i<n&& s.charAt(i)=='+'||s.charAt(i)=='-'){
        if(s.charAt(i)=='-'){
            sign=-1;
        }
        i++;
    }
    while (i<n&& Character.isDigit(s.charAt(i))) {
        int digit=s.charAt(i)-'0';
         num=num*10+digit;
         if (sign*num>Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
         }
         if(sign*num<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
         }
         i++;
    }
    return(int)(sign*num);
}
    

    public static void main(String[] args) {
        System.out.println(atoi("1234abc"));
        System.out.println(atoi("-1234abc"));
        System.out.println(atoi("4758 Royal"));
        System.out.println(atoi("@53 23"));
        System.out.println(atoi("46"));
        
    }
}