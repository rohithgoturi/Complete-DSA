public class mergeTwoArrays {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7 };
        int[] b = { 2, 4, 6, 8 };

        int[] c = new int[a.length+b.length];

        mergeArrays(a, b, c);
        for (int i : c) {
            System.out.print(i+" ");
        }
        
    }

    static int mergeArrays(int[] a, int[] b, int[] c){

        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                c[k] = b[j];
                k++;
                j++;
            } else {
                c[k] = a[i];
                k++;
                i++;
            }

            if(i==a.length) {
                while(j<b.length){
                    c[k++] = b[j++];
                }   
            }

            if(j==b.length){
                while(i<a.length){
                    c[k++] = a[i++];
                }
            }


        }

        

        return 0;
    }
}
