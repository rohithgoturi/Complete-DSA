//union of two sorted arrays and they do not contain any duplicate elements in the output

import java.util.ArrayList;

public class unionSortedArr {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int a[] = { 2, 2, 3, 4, 5 };
        int b[] = { 1, 1, 2, 3, 4 };
        int[] c = new int[a.length + b.length];

        //merging two arrays
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if(a[i]>b[j]){
                c[k] = b[j];
                j++;
                k++;
            } else {
                c[k] = a[i];
                i++;
                k++;
            }

            if(i==a.length){
                while(j<b.length){
                    c[k] = b[j];
                    j++;
                    k++;
                }
            }

            if(j==b.length){
                while(i<a.length){
                    c[k] = a[i];
                    i++;
                    k++;
                }
            }
        }

        //removing duplicates
        i = 1;
        ans.add(c[0]);

        while(i<c.length){
            if(c[i-1] != c[i]) ans.add(c[i]);
            i++;
        }

        System.out.println(ans);
    }
}
