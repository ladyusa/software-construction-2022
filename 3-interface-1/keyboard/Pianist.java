package keyboard;

public class Pianist {

    private Keyboard keyboard;

    public Pianist(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void playMusic() {
        keyboard.pressWhiteKey(1);
        keyboard.pressWhiteKey(2);
        keyboard.pressWhiteKey(3);
    }
}
