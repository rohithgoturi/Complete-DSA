public class evenlyDivides {
    public static int evenlyDivide(int n) {
        // code here
        int count = 0;
        int org = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && org % digit == 0) count++;
            n /= 10;
        }
        
        return count;
    }

    public static void main(String[] args) {
        int n = 1012;
        System.out.println(evenlyDivide(n)); // Output: 3
    }
}
