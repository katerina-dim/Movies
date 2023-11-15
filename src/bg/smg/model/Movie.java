package bg.smg.model;

public class Movie {
    private String title;
    private int year;
    private int length;
    private boolean inColor;
    private Studio studio;
    private MovieExec producer;

    public Movie() {
    }

    public Movie(String title, int year, int length, boolean inColor, Studio studio, MovieExec producer) {
        this.title = title;
        this.year = year;
        this.length = length;
        this.inColor = inColor;
        this.studio = studio;
        this.producer = producer;
    }
}
