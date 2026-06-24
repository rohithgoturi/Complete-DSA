import java.util.ArrayList;

public class commonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        ArrayList<Integer> common = findCommon(arr1, arr2);
        System.out.println("Common elements: " + common);
    }

    public static ArrayList<Integer> findCommon(int[] arr1, int[] arr2){
        ArrayList<Integer> commonElements = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                commonElements.add(arr1[i]);
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j]) i++;
            else j++;
        }
        
        return commonElements;
    }
}
