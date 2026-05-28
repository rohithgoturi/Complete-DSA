public class transposeNewArr {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] brr = new int[cols][rows];

        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                brr[i][j] = arr[j][i];
            }
        }

        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                System.out.print(brr[i][j]+ " ");

            }
            System.out.println();
        }
    }
}
