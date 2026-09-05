import java.util.Arrays;
class Player implements Comparable<Player> {

    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;

    public Player(String name, int matchesPlayed,
                  double battingAverage, boolean injured) {

        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    static boolean isDraftable(int matchesPlayed) {

        return matchesPlayed >= 10;
    }

    static boolean isDraftable(int matchesPlayed, boolean injured) {

        return matchesPlayed >= 5 && !injured;
    }

    public int compareTo(Player other) {

        return Double.compare(other.battingAverage,
                              this.battingAverage);
    }

    public String getName() {

        return name;
    }
}

public class Problem5 {

    static String draftAndRank(Player[] players) {

        Player[] draftable = new Player[players.length];

        int count = 0;

        for (Player p : players) {

            if (Player.isDraftable(p.matchesPlayed) ||
                Player.isDraftable(p.matchesPlayed, p.injured)) {

                draftable[count] = p;
                count++;
            }
        }

        Player[] result = Arrays.copyOf(draftable, count);

        Arrays.sort(result);

        String answer = "";

        for (int i = 0; i < result.length; i++) {

            answer = answer + (i + 1) + ". "
                    + result[i].getName();

            if (i < result.length - 1) {
                answer = answer + " | ";
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Player[] players = {

            new Player("Virat", 15, 48.0, false),

            new Player("Rahul", 7, 55.0, false),

            new Player("Sameer", 3, 60.0, false),

            new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
    }
}
