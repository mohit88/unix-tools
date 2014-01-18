package mohitsha.unixtools.cli;

import mohitsha.myIOStream.MyFileReader;
import mohitsha.unixtools.lib.UniqLib;

public class Uniq {
    public static void main(String[] args) {

        String fileName = args[0];
        String fileContent = new MyFileReader().readFile(fileName);

        String uniqueLines = new UniqLib().getUniqueLines(fileContent);

        System.out.println(uniqueLines);
    }
}
