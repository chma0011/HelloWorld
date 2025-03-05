//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie midtOmNatten = new Movie();
        midtOmNatten.setTitel("Midt Om Natten");
        midtOmNatten.setDirector("Erik Clausen");
        midtOmNatten.setDuration(2.5);

        System.out.println(midtOmNatten.getTitel());
        System.out.println(midtOmNatten.getDirector());
        System.out.println(midtOmNatten.getDuration());

        midtOmNatten.getMovieDetails();
        System.out.println(midtOmNatten.getMovieDetails());


    }

}