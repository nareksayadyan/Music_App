package am.aca.musicapp.common.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created by Narek on 11.09.2016.
 */
public class FromConsole {
    private static FromConsole instance = null;

    private FromConsole() {}

    public static FromConsole getInstance() {
        if (instance == null) {
            instance = new FromConsole();
        }
        return instance;
    }

    public String getInput(String message) {
        String string = null;
        System.out.print(message);
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            string = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return string;
    }

}
