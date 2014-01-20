package mohitsha.unixtools.cli;

import mohitsha.myIOStream.MyFileReader;
import mohitsha.unixtools.lib.SortLib;

public class Sort {
    public static void main(String[] args) {
        String fileName = args[0];
        String fileContent = new MyFileReader().readFile(fileName);
        String sortContent = new SortLib().simpleSort(fileContent);
        System.out.println(sortContent);
    }
}