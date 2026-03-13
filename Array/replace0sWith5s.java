public class replace0sWith5s {
    public static void main(String[] args) {
        int num = 1004;

        System.out.println("original number : "+num);
        int rev = 0;
        int digit;
        while(num!=0) {
            digit = num % 10;
            if(digit == 0) digit = 5;

            rev = rev*10 + digit;
            num /= 10;
        }

        int ans = 0;
        while(rev!=0) {
            ans = ans*10 + rev%10;
            rev /= 10;
        }
        System.out.println("new replaced Number : "+ans);

        
    }
}
