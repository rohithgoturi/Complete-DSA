public class removeCharacters {
    public static void main(String[] args) {
        String str = "3geekForge33Eks23";
        
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)) newStr += ch;
        }
        System.out.println(newStr);
    }
}
