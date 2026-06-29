import java.util.Scanner;

public class printOneToN {
    public static void main(String[] args) {
        int x = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(x,n);
        sc.close();
    }

    public static void print(int x, int n){
        if(x > n) return;
        System.out.println(x);
        print(x+1,n);
    }
}
