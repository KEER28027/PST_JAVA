import java.util.*;

public class WEEK10_TASK5_MUSIC_PLAYLIST_LINKED_LIST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            playlist.add(sc.next());
        }

        String removeSong = sc.next();
        playlist.remove(removeSong);

        for (String song : playlist) {
            System.out.println(song);
        }
    }
}
