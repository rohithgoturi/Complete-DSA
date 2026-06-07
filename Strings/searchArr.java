public class searchArr{
    public static void main(String[] args) {
        String str = "GeekforGeeks";
        char ch = 'k';

        int idx = search(str, ch);
        if(idx != -1) System.out.print("character is found at "+idx);
        else System.out.print("character not found");
    }

    // we can also check character existance by using builtin method str.indexOf('k');

    public static int search(String str, char ch){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch) return i;
        }
        return -1;
    }
}