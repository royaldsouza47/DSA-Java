public class ReverseWords {

    public static String reversewords(String s){
        String[] words=s.trim().split("\\s+");
int left=0;
int right=words.length-1;
        while (left<right) {
            String temp=words[left];
            words[left]=words[right];
            words[right]=temp;
            left++;
            right--;
        }
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        String s="Welocme to the jungle";
        System.out.println(reversewords(s));
    }
}