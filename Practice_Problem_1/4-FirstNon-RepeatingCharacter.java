import java.util.Scanner;

class Main {

    static char findFirstNonRepeatingChar(String text) {

        // Check every character
        for (int i = 0; i < text.length(); i++) {

            int count = 0;

            // Count how many times the character appears
            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            // If character appears only once
            if (count == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result == '\0') {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println("First Non-Repeating Character: '" + result + "'");
        }

        sc.close();
    }
}
