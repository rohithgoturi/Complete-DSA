public class removeVowels {
    public static void main(String[] args) {
        String str = "i love coding";

        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                newStr.append(ch);
            }
        }
        System.out.println(newStr);
    }
}
