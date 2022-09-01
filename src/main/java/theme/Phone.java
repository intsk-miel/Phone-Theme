package theme;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public abstract class Phone{
    private  static final Logger LOGGER = LogManager.getLogger(Samsung.class);
    private HashMap<String, Integer>[] messages;
    private String model;
    private int price;
    private double weight;
    private int phoneNumber;
    private static int index = 0;

    public Phone(){}
    public Phone(String model, int price, double weight, int phoneNumber) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.phoneNumber = phoneNumber;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    List<Map<String , Integer>> myMap = new ArrayList<Map<String, Integer>>();
    public void sendMessage(int phoneNumber, String message){
        Map<String, Integer> myMap1 = new HashMap<String, Integer>();
        myMap1.put( message, phoneNumber);

        myMap.add(index,myMap1);
        index++;
    }

    public void readMessage(int index){
        LOGGER.info(myMap.get(index));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone pho = (Phone) o;
        return model == pho.model && Double.compare(pho.price, price) == 0 && Objects.equals(weight, pho.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price, weight);
    }

    @Override
    public String toString() {
        return model + " " + price;
    }
}

