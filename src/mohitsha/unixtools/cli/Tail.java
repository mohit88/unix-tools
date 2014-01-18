package mohitsha.unixtools.cli;

import mohitsha.myIOStream.MyFileReader;

public class Tail {

    public static void main(String[] args) {
        Tail tail = new Tail();

        String fileName = args[0];

        int noOfLines = 10;
        if (args.length == 2) noOfLines = Math.abs(Integer.parseInt(args[1]));

        String fileContent = new MyFileReader().readFile(fileName);

    }
}
