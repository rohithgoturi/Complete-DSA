public class palindromeStr {
    public static void main(String[] args) {
        String s = "aba";
        boolean result = checkPalindrome(s);
        System.out.println(result);
    }

    public static boolean checkPalindrome(String s) {
        StringBuilder revStr = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            revStr.append(s.charAt(i));
        }

        if (s.equals(revStr.toString())) return true;

        return false;
    }
    
}
