package collections;

public class PhoneThings implements Comparable<PhoneThings>{
    private int cost;
    private String colour;
    private double weight;


    public PhoneThings(int cost, String colour, double weight) {
        this.cost = cost;
        this.colour = colour;
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int Cost(){
        return cost;
    }

    @Override
    public int compareTo(PhoneThings ph) {
        return Cost() - ph.Cost();
    }
    @Override
    public String toString() {
        return "Cost = " + Cost();
    }
}
