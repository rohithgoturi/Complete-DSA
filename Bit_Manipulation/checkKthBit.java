public class checkKthBit {
    public static boolean checkKthBit(int n, int k) {
        return (n>>k) % 2 == 1;
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        
        boolean isKthBitSet = checkKthBit(n, k);
        System.out.println("Is the " + k + "th bit of " + n + " set? " + isKthBitSet);
    }
}
