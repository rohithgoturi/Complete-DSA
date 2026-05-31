public class rotateImageA {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2}, {3,4,5}, {6,7,8}};

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length-1;
            while(start < end){
                int temp = arr[start][i];
                arr[start][i] = arr[end][i];
                arr[end][i] = temp;

                start++;
                end--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }
    }
}
