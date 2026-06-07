public class checkString {
    public static void main(String[] args) {
        String str = "geeks";

        boolean check = checkString(str);
        System.out.println(check);
    }

    public static Boolean checkString(String str) {
        // your code here
        
        for(int i=1; i<str.length(); i++){
           if(str.charAt(i) != str.charAt(0)) return false;
        }
        
        return true;
    }
}
