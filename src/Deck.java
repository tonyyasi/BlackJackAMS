/**
 * Created by tonyyasi on 11/2/17.
 */

import java.util.Random;

public class Deck {

    private Random rand = new Random();

    public int hit(){
        return rand.nextInt(11) + 1;
    }
}
