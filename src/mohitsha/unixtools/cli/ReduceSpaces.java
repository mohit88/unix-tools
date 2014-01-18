package mohitsha.unixtools.cli;

import mohitsha.myIOStream.MyFileReader;
import mohitsha.myIOStream.MyFileWriter;
import mohitsha.unixtools.lib.ReduceSpacesLib;

public class ReduceSpaces {
    public static void main(String[] args) {
        String fileName = args[0];
        String fileContent = new MyFileReader().readFile(fileName);
        String reducedSpaceContent = new ReduceSpacesLib().reduceSpaces(fileContent);
        new MyFileWriter().writeFile(fileName, reducedSpaceContent);
    }
}
