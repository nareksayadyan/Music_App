package am.aca.musicapp.controller;

/**
 * Created by Narek on 11.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        Controller appMusic = Controller.getInstance();
        appMusic.execute(true);

    }
}
