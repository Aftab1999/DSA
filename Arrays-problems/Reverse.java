public class Reverse {

    public static void reverseStrings(String[] strings) {
        int first = 0, last = strings.length - 1;  

        while (first < last) {
            String temp = strings[last];  // C 
            strings[last] = strings[first]; // A
            strings[first] = temp; // C

            first++;
            last--;
        }
    }

    public static void main(String[] args) {

        String[] strings = {"A", "B", "C"};

        reverseStrings(strings);

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }

        System.out.println();
    }
}
