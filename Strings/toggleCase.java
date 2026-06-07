public class toggleCase {
    public static void main(String[] args) {
        String str = "geekForgeEks";
        System.out.println(str);

        String result = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            }
            else{
                result += Character.toUpperCase(ch);
            }
        }

        System.out.println(result);
    }
}
