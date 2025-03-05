public class Movie {
    private String titel;
    private String director;
    private double duration;

    public String getTitel() {
        return "Titel: " + titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDirector() {
        return "Director: " + director;
    }

    public void setDirector(String director) {

        this.director = director;
    }

    public double getDuration() {

        return duration;
    }

    public void setDuration(double duration) {

        this.duration = duration;
    }

    public String getMovieDetails() {
        return getTitel() + "\n" + getDirector() + "\n" + "Lenght: " + getDuration() + "timer";

    }
}
