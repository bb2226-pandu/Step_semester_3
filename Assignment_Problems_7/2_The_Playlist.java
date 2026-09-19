import java.util.Scanner;

class Playlist {

    private final String[] songs;
    private int count;

    Playlist(int size) {
        songs = new String[size];
        count = 0;
    }

    public void addSong(String song) {

        if (count < songs.length) {
            songs[count] = song;
            count++;
        } else {
            System.out.println("Playlist is full.");
        }
    }

    public String[] getSongs() {
        return songs.clone();
    }

    public int getSongCount() {
        return count;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum playlist size: ");
        int size = sc.nextInt();

        sc.nextLine();

        Playlist p = new Playlist(size);

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter song " + (i + 1) + ": ");
            String song = sc.nextLine();

            p.addSong(song);
        }

        System.out.println("\nSongs in playlist:");

        String[] copy = p.getSongs();

        for (int i = 0; i < p.getSongCount(); i++) {
            System.out.println(copy[i]);
        }

        System.out.println("Song Count = " + p.getSongCount());

        sc.close();
    }
}
