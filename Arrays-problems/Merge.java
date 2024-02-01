public class Merge {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] newarr = new int[arr1.length + arr2.length];

        // Copy elements from arr1 to newarr
        
        for (int i = 0; i < arr1.length; i++) {
            newarr[i] = arr1[i];
        }

        // Copy elements from arr2 to newarr
        for (int i = 0; i < arr2.length; i++) {
            newarr[arr1.length + i] = arr2[i];
        }

        // Print the new array
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
