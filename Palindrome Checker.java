import java.util.Scanner;

class Main {
    static boolean isPalindromeIterative(String text) {

        for (int i = 0; i < text.length() / 2; i++) {

            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
    static boolean isPalindromeRecursive(String text) {

        if (text.length() <= 1) {
            return true;
        }

        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

        return isPalindromeRecursive(
                text.substring(1, text.length() - 1)
        );
    }

    // 3. Array reversal method
    static boolean isPalindromeArrayReversal(String text) {

        char[] arr = text.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {

            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        String reversed = new String(arr);

        return text.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text);
        boolean result3 = isPalindromeArrayReversal(text);

        System.out.println();

        System.out.println("Iterative: " +
                (result1 ? "Palindrome" : "Not Palindrome"));

        System.out.println("Recursive: " +
                (result2 ? "Palindrome" : "Not Palindrome"));

        System.out.println("Array Reversal: " +
                (result3 ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
