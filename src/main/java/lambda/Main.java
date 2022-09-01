package lambda;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        BiConsumer<Double, Double> sum = (a, b)  -> LOGGER.info(a + b);
        sum.accept(10.3, 9.7);


        String mobile = "Apple";
        Supplier<Integer> lengthMobile = () -> mobile.length();
        Supplier<String> upWords = () -> mobile.toUpperCase();
        LOGGER.info(lengthMobile.get());
        LOGGER.info(upWords.get());


        IntSupplier is = () -> {
            String first = "100";
            int second = 200;
            return Integer.parseInt(first + second);
        };
        LOGGER.info(is.getAsInt());


        Predicate<String> startingL = x -> x.startsWith("L");
        List<String> list = Arrays.asList("Liz", "Allison", "Nika", "David", "Lia");
        List<String> collect = list.stream()
                .filter(startingL.negate())
                .collect(Collectors.toList());
        LOGGER.info(collect);


        IntFunction<Double> doubled = input -> Double.valueOf(input);
        LOGGER.info("Double value of seven is " + doubled.apply(7));



        ICompareNumbers<Integer> comparing = (number1, number2) -> {
            return number1 > number2;
        };

        IDivideNumbers<Double, Double, Double> division = ((num1, num2) -> num1 / num2);
        LOGGER.info("Division is " + division.divide(20.5, 10.2));

        ISaySomething something = voice -> LOGGER.info(voice);
        something.saysth("hey");

    }
}