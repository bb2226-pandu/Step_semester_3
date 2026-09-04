import java.util.Scanner;

class Main {

    // Method to classify BMI
    static String getBmiStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to calculate and print the report
    static void printWellnessReport(double[] heights, double[] weights) {

        System.out.println();
        System.out.println("------------- WELLNESS REPORT -------------");
        System.out.println("Person\tHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < heights.length; i++) {

            double bmi = weights[i] / (heights[i] * heights[i]);

            String status = getBmiStatus(bmi);

            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s%n",
                    i + 1, heights[i], weights[i], bmi, status);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10;

        double[] heights = new double[n];
        double[] weights = new double[n];

        // Get input for 10 people
        for (int i = 0; i < n; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Enter height (m): ");
            heights[i] = sc.nextDouble();

            System.out.print("Enter weight (kg): ");
            weights[i] = sc.nextDouble();

            System.out.println();
        }

        // Print final report
        printWellnessReport(heights, weights);

        sc.close();
    }
}
