package eu.ciganek.slovicka;

import android.content.Context;
import android.util.Pair;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Tomáš on 17.12.2016.
 * Class to manage source file with vocabulary
 */
final class FileSource {

    ArrayList<Pair<String,String>> couples;

    /**
     * @param context Used for passing aplcation context to the function
     */
    FileSource(Context context) {

        InputStreamReader isr;
        BufferedReader bufferedReader;
        String line;

        String filename;
        filename = "slovicka.csv";
        couples = new ArrayList<Pair<String,String>>();

        try (FileInputStream fis = context.openFileInput(filename)) {
            isr = new InputStreamReader(fis);
            bufferedReader = new BufferedReader(isr);
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    String[] items = line.split(",");
                    couples.add(new Pair<>(items[0], items[1]));

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
