package interfaces;

import theme.Xiaomi;

public class Main {
    public static void main(String[] args) {
        Xiaomi xio = new Xiaomi("1990", 400, 1.5, "oval");
        xio.call();
        xio.type();
    }
}
