import java.util.Scanner;

class Main {

    static void parseInventoryRecord(String csvLine) {

        // Split the CSV line
        String[] data = csvLine.split(",");

        // Check for exactly 3 fields
        if (data.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        // Print the record
        System.out.println("Product: " + data[0]
                + " | SKU: " + data[1]
                + " | Qty: " + data[2]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter inventory record: ");
        String csvLine = sc.nextLine();

        parseInventoryRecord(csvLine);

        sc.close();
    }
}
