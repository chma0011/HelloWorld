import java.util.Random;

public class Terningkast {
    Random random = new Random();

    public int getDieRoll(){
        return random.nextInt(6) + 1;
    }

}
