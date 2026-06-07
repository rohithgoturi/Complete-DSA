public class countType {
    public static void main(String[] args) {
        String str = "abAcD1234!@#$";
        int result[] = countType(str);
        
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] countType(String s) {
        int upper = 0;
        int lower = 0;
        int numeric = 0;
        int special = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)) upper++;
            else if(Character.isLowerCase(ch)) lower++;
            else if(Character.isDigit(ch)) numeric++;
            else special++;
        }
        
        int arr[] = {upper, lower, numeric, special};
        
        return arr;
    }
}
