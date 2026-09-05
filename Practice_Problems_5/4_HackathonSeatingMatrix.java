import java.util.Scanner;
public class HackathonSeatingMatrix {
    static double rowAverage(int[] row) {
        int sum = 0;
        for (int i = 0; i < row.length; i++) {
            sum = sum + row[i];
        }
        return (double) sum / row.length;
    }

    static String classifyRows(int[][] scores, int threshold) {

        String result = "";

        for (int i = 0; i < scores.length; i++) {

            double average = rowAverage(scores[i]);

            if (average < threshold) {
                result = result + "Row " + i + ": Quiet Zone";
            }
            else {
                result = result + "Row " + i + ": Buzzing Zone";
            }
            if (i < scores.length - 1) {
                result = result + " | ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] scores = {
            {40, 50, 45},
            {85, 90, 95},
            {30, 20, 25}
        };
        int threshold = 60;
        System.out.println(classifyRows(scores, threshold));
    }
}
