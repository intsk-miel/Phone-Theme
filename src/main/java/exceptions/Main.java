package exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
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



        try {
            WriteYourName();
        }catch (UserNotFoundException e){
            LOGGER.error("There is no name" );
        }


        try {
            CircleRadius();
        } catch (InvalidRadiusException e){
            LOGGER.error("It is wrong radius");
        }


        try {
            division();
        }catch (DivideByTenException e){
            LOGGER.error("It can not divide by 10");
        }
    }
    public static void checkAge(int age) throws AgeException {
        if (age < 12) {
            throw new AgeException("You must be 12+ to sign up in this application");
        } else {
            LOGGER.info("You are signed up");
        }
    }

    public static void WriteYourName() throws UserNotFoundException {
        Scanner scan = new Scanner(System.in);
        String username;
        String alex ="Alex";
        LOGGER.info("Username : ");
        username=scan.next();
        if(Objects.equals(username, alex)) LOGGER.info("You can go in");
        else throw new UserNotFoundException("Can not find username");
    }

    public static void CircleRadius() throws InvalidRadiusException {
        Scanner scan = new Scanner(System.in);
        double r;
        LOGGER.info("radius : ");
        r = scan.nextDouble();
        if (r >= 0) LOGGER.info("It is Circle");
        else throw new InvalidRadiusException("Radius can not be negative");
    }

    public static void division() throws DivideByTenException{
        Scanner scan = new Scanner(System.in);
        double x;
        double y;
        LOGGER.info("x = "); x=scan.nextInt();
        LOGGER.info("y = "); y=scan.nextInt();
        double z = x / y;
        if(y == 10)
            throw  new DivideByTenException("divide by 10");
        else LOGGER.info(z);
    }

}

