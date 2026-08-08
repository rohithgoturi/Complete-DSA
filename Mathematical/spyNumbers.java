public class spyNumbers {
     public static boolean checkSpy(int n) {
        int sum = 0;
        int prod = 1;
        
        while(n!=0){
            int digit  = n%10;
            sum += digit;
            prod *= digit;
            n /= 10;
        }
        
        return sum == prod;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(checkSpy(n)); 
    }
}
