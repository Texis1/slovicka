package eu.ciganek.slovicka;

import android.content.Context;

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

    ArrayList<Word> words;
    String filename;
    /**
     * @param context Used for passing application context to the function
     */
    FileSource(Context context) {

        InputStreamReader isr;
        BufferedReader bufferedReader;
        String line;

        filename = "slovicka.csv";
        words = new ArrayList<Word>();

        try (FileInputStream fis = context.openFileInput(filename)) {
            isr = new InputStreamReader(fis);
            bufferedReader = new BufferedReader(isr);
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    String[] items = line.split(",");
                    words.add(new Word(items[0], items[1], "", Boolean.FALSE));

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            fis.close();
        } catch (IOException e) { // TODO: Create general way how to display error messages
            e.printStackTrace();
        }

    }


}
