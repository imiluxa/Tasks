
import java.util.Scanner;

/**
 * Created by User on 09.02.2020.
 */
public class Controller {
    // The Constants
    public static final double PI = 3.14;

    // The Regex
    // «nick@mail.com»
    public static final String REGEX_MAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    // «http://www.my-site.com»
    public static final String REGEX_URL = "^((https?|ftp)\\:\\/\\/)?([a-z0-9]{1})((\\.[a-z0-9-])|([a-z0-9-]))*\\.([a-z]{2,6})(\\/?)$";
    // «+38(044)555-55-55»
    public static final String REGEX_PHONE = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        int generatedNumber = model.getRandomNumber();
        view.printMessage(String.valueOf(generatedNumber));


        sc.close();
    }

    // The Utility methods
    /*
     *Waiting for update
     */
    public void letTheGameBegin(Scanner sc, int generatedNumber) {
        view.printMessage(View.INITIAL_MESSAGE + View.DELIMITER);
        while( ! sc.hasNextInt(generatedNumber)) {
            int input = sc.nextInt();
            if ( ! model.range.contains(input)) {
                view.printMessage(View.ERROR_NOT_IN_RANGE);
            }
            if (input > generatedNumber) {
                view.printMessage(View.ERROR_HIGHER);
                model.range.updateRange(model.range.getLower(), input);
            } else {
                view.printMessage(View.ERROR_LOWER);
                model.range.updateRange(input, model.range.getHigher());
            }
            model.addStatistics(input);
            sc.nextInt();
        }
        model.addStatistics(sc.nextInt());
    }
}