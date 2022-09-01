package interfaces;

import theme.Iphone;
import theme.Samsung;
import theme.Xiaomi;

public class Main {
    public static void main(String[] args) {
        Xiaomi xio = new Xiaomi("1990", 400, 1.5, "oval");
        xio.call();
        xio.writeType();

        Samsung sam = new Samsung("2021", 900, 2.3, "Black", 54638292);
        sam.amoledDisplay();
        sam.thinFilmTransistor();
        sam.voice();
        sam.retinaDisplay();
        sam.hapticTouchscreen();

        Iphone ip = new Iphone("2020", 1000, 2, 131.5, 434495710 );
        ip.ultrasonic();
        ip.capacitive();
        ip.optical();
    }
}
