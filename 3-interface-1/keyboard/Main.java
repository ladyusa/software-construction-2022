package keyboard;

public class Main {

    public static void main(String[] args) {

        Pianist pianist = new Pianist(new Piano());
        pianist.playMusic();

        pianist.setKeyboard(new Organ());
        pianist.playMusic();
    }
}
