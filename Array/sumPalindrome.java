public class sumPalindrome {
    public static void main(String[] args) {
        System.out.println(isSumPalindrome(73));
    }

    static int isSumPalindrome(int n) {

        int temp = n, rev = 0;
        
        while(temp != 0) {
            rev = rev*10 + temp%10;
            temp /= 10;
        }

        if(rev == n) return rev;

        for (int i = 0; i < 5; i++) {
            temp = n;
            rev = 0;

            while(temp!= 0) {
                rev = rev*10 + temp%10;
                temp /= 10;
            }

            n = n + rev;
            temp = n;
            rev = 0;
            while(temp != 0){
                rev = rev*10 + temp %10;
                temp /= 10;
            }

            if(rev == n) return rev;
        }

        return -1;
    }
}
