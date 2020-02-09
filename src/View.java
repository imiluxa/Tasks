import java.util.ArrayList;

/**
 * Created by User on 09.02.2020.
 */
public class View {
    // Text's constants
    public static final String DELIMITER = " ";
    public static final String INITIAL_MESSAGE = "Random number from 0 and 100 generated. Try to guess!";
    public static final String ERROR_HIGHER = "Number was higher than inputed";
    public static final String ERROR_LOWER = "Number was lower than inputed";
    public static final String ERROR_NOT_IN_RANGE = "Inputed number is not in range!";
    public static final String CONGRATULATIONS = "Congratulations! You Win! See your history:";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printArray(ArrayList<Integer> arrayList) {
        for (int value : arrayList
             )
            System.out.print(value + DELIMITER);
    }
}
