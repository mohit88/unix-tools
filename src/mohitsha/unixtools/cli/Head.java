package mohitsha.unixtools.cli;

import mohitsha.myIOStream.MyFileReader;
import mohitsha.unixtools.lib.HeadLib;

public class Head {
    public static void main(String[] args) {
        String fileName = args[0];

        int noOfLines = 10;
        if(args.length == 2) noOfLines = Math.abs(Integer.parseInt(args[1]));

        String fileContent = new MyFileReader().readFile(fileName);

        String startingLines = new HeadLib().getStartingLine(fileContent,noOfLines);

        System.out.println(startingLines);
    }
}