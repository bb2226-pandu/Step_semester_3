import java.util.Scanner;

class Main {

    static String validateFileExtension(String filename) {

        // Find the last dot
        int dot = filename.lastIndexOf('.');

        // No extension found
        if (dot == -1) {
            return "Rejected — invalid file type";
        }

        // Get the extension
        String extension = filename.substring(dot + 1);

        // Check accepted extensions
        if (extension.equalsIgnoreCase("pdf") ||
            extension.equalsIgnoreCase("docx") ||
            extension.equalsIgnoreCase("zip")) {

            return "Accepted";
        }

        return "Rejected — invalid file type";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        System.out.println(validateFileExtension(filename));

        sc.close();
    }
}
