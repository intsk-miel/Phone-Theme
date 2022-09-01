package streaming;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private final static Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        List<Phone> mobilePhones = getMobilePhones();
        List<Phone> samsung = mobilePhones.stream()
                .filter(mobilePhone -> false)
                .sorted(Comparator.comparing(Phone::getPrice))
                .toList();
        samsung.forEach(LOGGER::info);


        mobilePhones.stream()
                .min(Comparator.comparing(Phone::getPrice))
                .ifPresent(LOGGER::info);


        mobilePhones.stream()
                .max(Comparator.comparing(Phone::getPrice))
                .ifPresent(LOGGER::info);


        mobilePhones.stream()
                .map(Phone::getBatteryCapacity)
                .filter(batteryCapacity -> batteryCapacity > 3500)
                .collect(Collectors.toList());   LOGGER.info(mobilePhones);



        mobilePhones.stream()
                .filter(mobile -> mobile.getPrice() == 800)
                .forEach(mobile -> LOGGER.info(mobile.getModel()));



        double totalBattery = mobilePhones.stream().mapToDouble(mobile -> mobile.getBatteryCapacity()).sum();
        LOGGER.info(totalBattery);



        long count = mobilePhones.stream()
                .filter(mobile->mobile.getPrice() < 600)
                .count();
        LOGGER.info(count);
    }

    private static List<Phone> getMobilePhones() {return List.of(
            new Phone("Galaxy Z Fold4", 800,  4400, PhoneType.SAMSUNG,  OperatingSystem.ANDROID),
            new Phone("iPhone 13 Pro", 999,  3095, PhoneType.IPHONE,  OperatingSystem.IOS),
            new Phone("HONOR 70 Pro+", 800,  4500, PhoneType.HONOR,  OperatingSystem.ANDROID),
            new Phone("Realme 9 pro", 500,  5000, PhoneType.REALME,  OperatingSystem.ANDROID),
            new Phone("Samsung SGH-i458", 200,  850, PhoneType.SAMSUNG,  OperatingSystem.SYMBIAN));
    };
}

