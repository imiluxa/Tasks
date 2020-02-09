import java.util.ArrayList;
import java.util.Random;

/**
 * Created by User on 09.02.2020.
 */
public class Model {
    private static final int MIN_VALUE_INIT = 0;
    private static final int MAX_VALUE_INIT = 100;
    public Range range;
    private ArrayList<Integer> history = new ArrayList<>();

    private int rand( ) {
        Random random = new Random();
        range = new Range(MIN_VALUE_INIT, MAX_VALUE_INIT);
        return random.nextInt(MAX_VALUE_INIT - MIN_VALUE_INIT + 1) + MIN_VALUE_INIT;
    }

    private int rand(int minRangeValue, int maxRangeValue) {
        Random random = new Random();
        range = new Range(minRangeValue, maxRangeValue);
        return random.nextInt(maxRangeValue - minRangeValue + 1) + minRangeValue;
    }

    // The Program logic

    public int getRandomNumber() {
        return rand();
    }

    public void addStatistics(int number) {
        history.add(number);
    }

    public ArrayList<Integer> getHistory() {
        return history;
    }


}
