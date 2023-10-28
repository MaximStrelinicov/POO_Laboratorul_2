public class Song {
    private String compositor;
    private String title;

    Song (String compositor, String title){
        this.compositor = compositor;
        this.title = title;
    }

    public String getSongCompositor() {

        return compositor;
    }

    public String getSongTitle() {
        return title;
    }

    public void setSongCompositor(String compositor) {

        this.compositor = compositor;
    }

    public void setSongTitle(String title) {

        this.title = title;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + this.getSongTitle() + '\'' +
                ", compositor='" + this.getSongCompositor() + '\'' +
                '}';
    }
}
