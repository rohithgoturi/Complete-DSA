public class reciprocal {
    public static void main(String[] args) {
        String str = "ab D";

        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                char newCh = (char) (('A' + 'Z') - ch);
                newStr.append(newCh);
            }
            else if(Character.isLowerCase(ch)){
                char newCh = (char) (('a' + 'z') - ch);
                newStr.append(newCh);
            }
            else newStr.append(ch);
        }
        System.out.println(newStr);
    }
}
