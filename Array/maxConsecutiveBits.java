public class maxConsecutiveBits {
    public static void main(String[] args) {
        int arr [] = {0,1,0,1,1,1,1};

        int current = 1;
        int maxCount = 1;

        int i = 1;
        while(i<arr.length){
            if(arr[i-1] == arr[i]) current++;
            else current = 1;

            if(current>maxCount) maxCount = current;
            i++;
        }

        System.out.print(maxCount);
    }
}
