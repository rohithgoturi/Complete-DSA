public class firstOcurrance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;

        int idx = checkOcurrance(arr, k);
        System.out.println(idx);
    }

    public static int checkOcurrance(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == k){
                ans = mid;
                high = mid-1;
            }
            else if(arr[mid] > k) high = mid-1;
            else low = mid+1;
        }

        return ans;
    }
}
