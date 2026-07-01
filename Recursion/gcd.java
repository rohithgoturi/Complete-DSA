public class gcd {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int ans = gcd(a,b);
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        int n;
        if (a < b) n = a;
        else n = b;
        int divisor = 0;
        
        for(int i=1; i<=n; i++){
            if(a%i==0 && b%i==0) divisor = i;
        }

        return divisor;
    }
}
