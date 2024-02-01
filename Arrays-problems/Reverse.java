
// import java.util.Arrays;

// public class Reverse {

//     public static void reverseArray(int[] arr) {

//         int first = 0, last = arr.length - 1;

//         while( first < last ) {

//             int temp = arr[last];
//             arr[last] = arr[first];
//             arr[first] = temp;

//             first++;
//             last--;
            
//         }
//     }

//     public static void main(String[] args) {

//         int[] arr = {1,2,3,4,5,6,};

//           System.out.print(Arrays.toString(arr)+ " ");

//         System.out.println();
//     }
// }


// ______________


import java.util.Arrays;

public class Reverse{


// public static void reverseArray(int[] arr) {
 

    
// }


public static void main(String[] args) {

    int[] arr = {1,2,3,4,5};

    int first = 0,last = arr.length - 1; 

while( first < last) {

    int temp = arr[first]; 
    arr[first] = arr[last]; 
    arr[last] = temp; 

    first++; 
    last--;
}

    System.out.print(Arrays.toString(arr)+ "");

    System.out.println();

}


}


