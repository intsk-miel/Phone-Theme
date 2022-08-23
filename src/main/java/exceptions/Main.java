package exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private  static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LOGGER.info("Enter your age: ");
        int age = scan.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            LOGGER.info("There is a problem" + e);
        }


        Scanner keyboard = new Scanner(System.in);
        LOGGER.info("Enter your PinCode");
        try {
            int pin = keyboard.nextInt();
            if(pin < 5 || pin > 10){
                throw new InvalidNumberException("It is wrong, try again");
            }
        } catch ( InvalidNumberException e) {
            LOGGER.info(e.getMessage());
        }
    }
    static void checkAge(int age) throws AgeException {
        if (age < 12) {
            throw new AgeException("You must be 12+ to sign up in this application");
        } else {
            LOGGER.info("You are signed up");
        }
    }
}

