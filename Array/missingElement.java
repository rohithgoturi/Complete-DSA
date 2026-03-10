public class missingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};

        int n = arr.length + 1;
        int sum = n*(n+1)/2;
        int arraySum = 0;

        for(int ele : arr) arraySum += ele;

        int missingNumber = sum - arraySum;
        System.out.println(missingNumber);

    }
}
