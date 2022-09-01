package theme;

import java.util.Objects;

public final class AlcatelMobile extends Phone {
    private final String keypad;

    public AlcatelMobile(String keypad){
        this.keypad = keypad;
        super.setModel("alcatel 1V (2021)");
        super.setPrice(400);
    }

    public String getKeypad() {
        return keypad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AlcatelMobile alc = (AlcatelMobile) o;
        return keypad == alc.keypad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), keypad);
    }

    @Override
    public String toString(){
        return super.toString()+getKeypad();
    }
}
