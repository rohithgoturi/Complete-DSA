public class delAlternate{
    public static void main(String[] args) {
        String str = "geeks";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(i%2==0) result += str.charAt(i);
        }

        System.out.println(result);
    }
}