public class removeVowels {
    public static void main(String[] args) {
        String str = "i love coding";

        String newStr = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                newStr += ch;
            }
        }
        System.out.println(newStr);
    }
}
