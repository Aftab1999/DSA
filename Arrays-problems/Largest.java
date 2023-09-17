public class Largest {

    public static int getLargest(int numbers[]) {
        int larg = Integer.MIN_VALUE;
        int smal = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (larg < numbers[i]) {
                larg = numbers[i];
            }

            if (smal > numbers[i]) {
                smal = numbers[i];
            }
        }

        System.out.println("smallest value is : " + smal);
        
        return larg;

    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Largest value is : " + getLargest(numbers));

    }
}
