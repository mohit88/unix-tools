package mohitsha.myIOStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    public void writeFile( String fileName, String textToWrite) {

        File file = new File(fileName);
        try {
            if (!file.exists())file.createNewFile();

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(textToWrite);
            bw.close();
        } catch (IOException e) {
            System.err.println("unable to Write");
        }
    }
}
