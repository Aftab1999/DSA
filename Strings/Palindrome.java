public class Palindrome {
    
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) { //2 < 1 
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++; // 2
            right--;// 1
        }

        return true;
    }

    public static void main(String args[]) {
        String[] inputs = {
            "Abba",
            // "race a car"
        };

        for (int i = 0; i < inputs.length; i++) {
            boolean result = isPalindrome(inputs[i]);
            System.out.println("Input: s = \"" + inputs[i] + "\"");
            System.out.println("Output: " + result);
        }
    }
}
