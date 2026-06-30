public class pow1 {
    public static void main(String[] args) {
        int a = 2;
        int x = 10;
        int ans = pow(a,x);
        System.out.println(ans);
    }

    public static int pow(int a, int x){
        if(x == 0) return 1;
        if(x == 1) return a;
        return a*pow(a,x-1);
    }
}
