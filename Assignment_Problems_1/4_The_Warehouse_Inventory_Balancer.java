import java.util.Scanner;

class Main {

    static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        // Find total of Section A and Section B
        for (int i = 0; i < sectionA.length; i++) {
            totalA = totalA + sectionA[i];
            totalB = totalB + sectionB[i];
        }

        // Check balanced or not
        String status;

        if (totalA == totalB) {
            status = "Balanced";
        } else {
            status = "Not Balanced";
        }

        // Find highest quantity
        int highest = sectionA[0];
        String section = "Section A";
        int index = 0;

        // Check Section A
        for (int i = 0; i < sectionA.length; i++) {

            if (sectionA[i] > highest) {
                highest = sectionA[i];
                section = "Section A";
                index = i;
            }
        }

        // Check Section B
        for (int i = 0; i < sectionB.length; i++) {

            if (sectionB[i] > highest) {
                highest = sectionB[i];
                section = "Section B";
                index = i;
            }
        }

        // Display result
        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);
        System.out.println("Status: " + status);
        System.out.println("Highest Quantity: " + highest +
                " (" + section + ", Item " + (index + 1) + ")");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] sectionA = new int[3];
        int[] sectionB = new int[3];

        // Input Section A
        System.out.println("Enter quantities for Section A:");

        for (int i = 0; i < sectionA.length; i++) {
            sectionA[i] = sc.nextInt();
        }

        // Input Section B
        System.out.println("Enter quantities for Section B:");

        for (int i = 0; i < sectionB.length; i++) {
            sectionB[i] = sc.nextInt();
        }

        analyzeInventory(sectionA, sectionB);

        sc.close();
    }
}
