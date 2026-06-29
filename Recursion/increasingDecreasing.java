public class increasingDecreasing {
    public static void main(String[] args) {
        int n = 5;
        printIncDec(n);
    }

    public static void printIncDec(int n){
        if(n==0) return;
        System.out.print(n + " ");
        printIncDec(n-1);
        if(n!=1) System.out.print(n + " ");
    }
}
