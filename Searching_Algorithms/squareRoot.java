public class squareRoot {
    public static void main(String[] args) {
        int n = 5;
        // int root = 0;

        // for (int i = 1; i <= n; i++) {
        //     if(i*i > n) break;
        //     root = i;
        // }

        // System.out.println(root);

        int low = 1;
        int high = n;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(mid == n/mid){
                System.out.println(mid);
                break;
            }

            else if(mid > n/mid) high = mid+1;
            else low = mid-1;
        }

        
    }
}
