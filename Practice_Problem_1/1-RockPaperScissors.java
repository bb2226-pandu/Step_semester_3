import java.util.Scanner;
import java.util.Random;

class Main {

    // Method to find the winner
    static String playRound(String player, String computer) {

        if (player.equals(computer)) {
            return "Draw";
        }

        if (player.equals("Rock") && computer.equals("Scissors")) {
            return "Player Wins";
        }

        if (player.equals("Paper") && computer.equals("Rock")) {
            return "Player Wins";
        }

        if (player.equals("Scissors") && computer.equals("Paper")) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int wins = 0;
        int losses = 0;
        int draws = 0;

        int n = 5;

        String[] playerMove = new String[n];
        String[] computerMove = new String[n];
        String[] result = new String[n];

        // 5 rounds
        for (int i = 0; i < n; i++) {

            System.out.print("Round " + (i + 1) +
                    " - Enter Rock, Paper or Scissors: ");

            playerMove[i] = sc.next();

            // Computer chooses randomly
            computerMove[i] = moves[r.nextInt(3)];

            // Find winner
            result[i] = playRound(playerMove[i], computerMove[i]);

            System.out.println("Computer: " + computerMove[i]);
            System.out.println("Result: " + result[i]);
            System.out.println();

            // Count score
            if (result[i].equals("Player Wins")) {
                wins++;
            } else if (result[i].equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        // Display final table
        System.out.println("----- FINAL SUMMARY -----");

        System.out.println("Round\tPlayer\t\tComputer\tResult");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" +
                    playerMove[i] + "\t\t" +
                    computerMove[i] + "\t\t" +
                    result[i]);
        }

        // Calculate win percentage
        double winPercentage = (wins * 100.0) / n;

        System.out.println();
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + winPercentage + "%");

        sc.close();
    }
}
