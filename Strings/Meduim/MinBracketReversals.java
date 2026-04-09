public class MinBracketReversals {

    public static int countRev(String s) {

        // odd length can never be balanced
        if (s.length() % 2 != 0) return -1;

        int open = 0;
        int close = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    close++;
                }
            }
        }

        return (open + 1) / 2 + (close + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(countRev(")(())(((")); // 3
        System.out.println(countRev("((("));      // -1 odd length
        System.out.println(countRev("))(("));      // 2
    }
}