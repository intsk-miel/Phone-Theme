package theme;


public class Main {
    public static void main(String[] args) {
        Samsung sam = new Samsung("2000", 600, 2, "red", 5343453);
        sam.sendMessage(2342424, "My message has been sent from number");
        sam.readMessage(0);
        sam.sendMessage(1214353, "I have read it");
        sam.readMessage(1);

    }
}
