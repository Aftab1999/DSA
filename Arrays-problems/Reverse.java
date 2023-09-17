// public class Reverse {

//     public static void ReverseNum(int numbers[]) {
//         int first = 0, last = numbers.length-1;

//           while (first < last){
            
//                 int temp = numbers[last];
//                 numbers[last] = numbers[first];
//                 numbers[first] = temp;

//                 first++;
//                 last--;
//             }


//     }
//     public static void main(String[] args) {
//             int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};

//             ReverseNum(numbers);

//             for (int i = 0; i < numbers.length; i++) {
//                 System.out.print(numbers[i]+ "");
//             }

//             System.out.println();



          
//     }
// }


public class Reverse {

    public static void reverseStrings(String[] strings) {
        int first = 0, last = strings.length - 1;

        while (first < last) {
            String temp = strings[last];
            strings[last] = strings[first];
            strings[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        String[] strings = {"Hello", "World"};

        reverseStrings(strings);

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }

        System.out.println();
    }
}
