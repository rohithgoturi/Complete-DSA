public class longestSubarray {
    public static void main(String[] args) {

        int arr[] = {10, 5, 2, 7, 1, -10};
        int target = 15;
        int subarrayLength = 0;
        int sum = 0;
        int i = 0;
        int j = 0;

        
        for( j=0; j < arr.length; j++){
            sum += arr[j];

            while(sum > target && i <= j){
                sum -= arr[i];
                i++;
            }

            if(sum == target){
                i++;
                j++;
                subarrayLength = j-i+1;
                break;
            }
        }

        if(sum != target) subarrayLength=0;

        System.out.println(subarrayLength);

    }
}
