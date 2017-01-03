package slotmachine;

import java.util.Random;

public class RGR {

	    private int random1;
	    private int random2;
	    private int random3;
	    private int random;
	    
	    public int getRandom() {
	        Random generator = new Random();
	        random1 = generator.nextInt(10);
	        random2 = generator.nextInt(10);
	        random3 = generator.nextInt(10);
	        random = (random1 * 100) + (random2 * 10) + (random3);
	        return random;
	    }
	}
