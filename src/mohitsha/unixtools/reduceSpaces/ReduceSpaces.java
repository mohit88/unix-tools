package mohitsha.unixtools.reduceSpaces;

import mohit.myfilereader.MyFileReader;

public class ReduceSpaces {
    public static void main(String[] args) {
        String fileName = args[0];
        String fileContent = new MyFileReader().readFile(fileName);
        System.out.println(fileContent.replaceAll("\\s+"," "));
    }
}
