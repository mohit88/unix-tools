package mohitsha.unixtools.cli;

import mohitsha.myIOStream.MyFileReader;

public class Uniq {
    public static void main(String[] args) {
        String fileName = args[0];
        String fileContent = new MyFileReader().readFile(fileName);
        String[] lines = fileContent.split("\n");

        for (int index = 0; index < lines.length-1 ; index++) {
            if (lines[index].equals(lines[index+1])) continue;
            System.out.println(lines[index]);
        }
    }
}
