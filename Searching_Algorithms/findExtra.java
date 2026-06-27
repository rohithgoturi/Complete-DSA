public class findExtra {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,9,10,12};
        int[] b = {2,4,6,8,10,12};

        int extraElement = findExtraElement(a, b);
        System.out.println(extraElement);
    }

    public static int findExtraElement(int[] a, int[] b){
        int low = 0;
        int high = b.length-1;
        int ans = a.length-1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(a[mid] == b[mid]) low = mid+1;
            else {
                ans = mid;
                high = mid-1;
            }
        }

        return ans;
    }

}
