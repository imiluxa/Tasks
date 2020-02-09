import java.util.Random;

/**
 * Created by User on 09.02.2020.
 */
public class Model {
    private static final int MIN_VALUE_INIT = 1;
    private static final int MAX_VALUE_INIT = 100;

    private int rand( ) {
        Random random = new Random();
        return random.nextInt(MAX_VALUE_INIT - MIN_VALUE_INIT) + MIN_VALUE_INIT;
    }

    private int rand(int minRangeValue, int maxRangeValue) {
        Random random = new Random();
        return random.nextInt(maxRangeValue - minRangeValue) + minRangeValue;
    }

    // The Program logic

    public int getRandomNumber() {
        return rand();
    }


}
