public class countEven {
    public static void main(String[] args) {
        String str = "abacaba";
        int count = countEven(str);
        System.out.println(count);
    }

    public static int countEven(String str){
        int freq[] = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)-'a']++;
        }

        int count = 0;

        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>0 && freq[i]%2==0) count++;
        }

        return count;
    }
}
