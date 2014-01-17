package mohitsha.unixtools.sort;

import mohitsha.myIOStream.MyFileReader;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String fileName = args[0];
        String fileContent = new MyFileReader().readFile(fileName);
        String[] lines = fileContent.split("\n");

        Arrays.sort(lines);

        for (String line : lines) {
            System.out.println(line);
        }
    }
}