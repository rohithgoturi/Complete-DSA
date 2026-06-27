public class peakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int peakIndex = findPeakElement(nums);
        if(peakIndex == -1) System.out.println("given array is not a mountain array");
        else System.out.println("Peak Element Index: " + peakIndex);
    }

    public static int findPeakElement(int[] nums){
        int low = 0;
        int high = nums.length-1;

        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] > nums[mid+1]) high = mid;
            else low = mid+1;
        }
        
        return low;
    }
}
