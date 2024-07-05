public class Song {
    private String title;
    private String artist;
    private double duration;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.duration = 3.0;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                "Duration="+ duration +
                '}';
    }
}