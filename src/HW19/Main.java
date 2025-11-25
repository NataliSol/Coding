package HW19;


public class Main {
    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager();
        Song song1 = new Song("Imagine", "John Lennon", 183);
        Song song2 = new Song("Bohemian Rhapsody", "Queen", 354);
        Song song3 = new Song("Billie Jean", "Michael Jackson", 294);
        Song song4 = new Song("Billie Jean", "Michael Jackson", 294);
        playerManager.createUniqueSongCollection(song1);
        playerManager.createUniqueSongCollection(song2);
        playerManager.createUniqueSongCollection(song3);
        System.out.println(playerManager.uniqueSongCollectionSize());
        playerManager.createUniqueSongCollection(song4);
        System.out.println(playerManager.uniqueSongCollectionSize());
        playerManager.addSongToPlaybackQueue(song1);
        System.out.println(playerManager.playNextSongFromPlayback());
        playerManager.sortSongsByArtist();

    }
}
