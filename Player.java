import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private List<Song> playlist;

    public Player() {
        playlist = new ArrayList<>();
    }

    public void addSong(Song song) {
        playlist.add(song);
        System.out.println("Added: " + song);
    }

    public void removeSong(Song song) {
        if (playlist.remove(song)) {
            System.out.println("Removed: " + song);
        } else {
            System.out.println("Song not found: " + song);
        }
    }

    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (Song song : playlist) {
                System.out.println(song);
            }
        }
    }

    public boolean isEmpty(){
        return playlist.isEmpty();
    }

    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options: 1. Add Song 2. Remove Song 3. Display Playlist 4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter song artist: ");
                    String artist = scanner.nextLine();
                    player.addSong(new Song(title, artist));
                    break;
                case 2:
                    if(player.isEmpty()){
                        System.out.println("No Songs to remove...");
                    }
                    else{
                        System.out.print("Enter song title to remove: ");
                        String removeTitle = scanner.nextLine();
                        System.out.print("Enter song artist to remove: ");
                        String removeArtist = scanner.nextLine();
                        player.removeSong(new Song(removeTitle, removeArtist));
                    }
                    break;
                case 3:
                    player.displayPlaylist();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}