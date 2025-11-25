package HW19;

import java.util.*;

public class PlayerManager {
    Set<Song> songsSet = new HashSet<>();
    Queue<Song> songsQueue = new ArrayDeque<>();
    Stack<Song> playbackHistory = new Stack<>();

    public void createUniqueSongCollection(Song song) {
        songsSet.add(song);
    }
    public int uniqueSongCollectionSize(){
       return songsSet.size();
    }

    public void addSongToPlaybackQueue(Song song) {
        songsQueue.offer(song);
    }

    public Song playNextSongFromPlayback() {
        Song next = songsQueue.poll();

        if (next == null) {
            System.out.println("Queue empty!");
            return null;
        }

        System.out.println("Playing: " + next.getArtist() + " - " + next.getTitle());
        playbackHistory.push(next);

        return next;
    }
    public Song playPreviousSong() {
        if (playbackHistory.isEmpty()) {
            System.out.println("the history is empty, there is no previous song!");
            return null;
        }

        Song prev = playbackHistory.pop();
        System.out.println("Replaying from history: " + prev.getArtist() + " - " + prev.getTitle());
        return prev;
    }

    public void sortSongsByArtist() {
        List<Song> songList = new ArrayList<>(songsSet);
        songList.sort((a, b) -> a.getArtist().compareToIgnoreCase(b.getArtist()));
        System.out.println("Songs sorted by artist:");
        for (Song song : songList) {
            System.out.println(song.getArtist() + " - " + song.getTitle());
        }
    }
}
