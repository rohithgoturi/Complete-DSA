public class powerOfNumbers {
    public static void main(String[] args) {
        int n = 20;
        int ans = revExpo(n);
        System.out.println(ans);
    }

    public static int revExpo(int n){
        int rev = reverse(n);
        return pow(n, rev);
    }

    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            rev = rev*10 + n%10;
            n/=10;
        }

        return rev;
    }

    public static int pow(int a, int b){
        if(b==0) return 1;
        int call = pow(a, b/2);

        if(b%2==0) return call*call;
        else return call*call*a;
    }
}
