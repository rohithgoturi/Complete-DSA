public class floor {
    public static void main(String[] args) {
        int [] nums = {1, 2, 8, 10, 10, 12, 19};
        int target = 11;

        int floorIdx = findFloor(nums, target);
        System.out.println(floorIdx);
    }

    public static int findFloor(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;

        while(low <= high) {
            int mid = low + (high - low)/2;
            if(nums[mid] > target) high = mid-1;
            else if(nums[mid] <= target){
                ans = mid;
                low = mid+1;
            }
        }

        return ans;
    }
}
