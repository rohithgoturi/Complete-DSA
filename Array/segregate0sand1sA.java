public class segregate0sand1sA {
    public static void main(String[] args) {
        int [] arr = {0, 0, 1, 1, 0};

        int i = 0;
        int j = arr.length - 1;

        while(i<j) {
            if(arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        for(int ele : arr) {
            System.out.print(ele+ " ");
        }
    }
}
