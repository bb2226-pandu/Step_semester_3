import java.util.Scanner;

class Scorecard {

    private final boolean[] results;
    private int answerCount;

    Scorecard(int totalQuestions) {
        results = new boolean[totalQuestions];
        answerCount = 0;
    }

    public void recordAnswer(boolean correct) {

        if (answerCount < results.length) {
            results[answerCount] = correct;
            answerCount++;
        }
    }

    public int getScore() {

        int score = 0;

        for (int i = 0; i < answerCount; i++) {

            if (results[i]) {
                score++;
            }
        }

        return score;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of questions: ");
        int n = sc.nextInt();

        Scorecard scard = new Scorecard(n);

        for (int i = 0; i < n; i++) {

            System.out.print("Question " + (i + 1) + " (1=Correct, 0=Wrong): ");
            int answer = sc.nextInt();

            if (answer == 1) {
                scard.recordAnswer(true);
            } else {
                scard.recordAnswer(false);
            }
        }

        System.out.println("Final Score = " + scard.getScore());

        sc.close();
    }
}
