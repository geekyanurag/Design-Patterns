public class Main {

    public static void main(String args[]){
        Directory songs = new Directory("Songs");
        File songFile1 = new File("Tum se hi");
        songs.add(songFile1);

        Directory romSongs = new Directory("Romantic Songs");
        File songFile2 = new File("Mohabbatein");
        romSongs.add(songFile2);
        songs.add(romSongs);

        songs.ls();
    }
}
