package week8;
import static java.lang.System.out;



/**
 * Created by syezdsultanov on 3/26/17.
 */
public enum Transport {CAR(4), BOAT(1), plane(2), TAXI(0), UBER(1000), LYFT(500);
private int count;

    Transport(int count) {
        this.count = count;
    }
    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        out.println("kasha");
    }
}
