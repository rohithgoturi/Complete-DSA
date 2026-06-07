public class removeChar {
    public static void main(String[] args) {
        String str = "geekforgeeks";
        int pos = 5;

        String res = removeCharacter(str, pos);
        System.out.println(res);
    }

    public static String removeCharacter(String s, int pos) {
        int n = s.length();
        if(n==1) return "";
        String str = s.substring(0, pos)+s.substring(pos+1, n);
        return str;
    }
}
