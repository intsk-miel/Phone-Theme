package threads;


public class Main {
    public static void main(String[] args) {
        Thread myFirst = new Thread(new FirstThread());
        myFirst.start();
        SecondThread mySecond = new SecondThread();
        mySecond.start();
    }
}
