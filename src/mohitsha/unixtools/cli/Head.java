package mohitsha.unixtools.cli;

import mohitsha.myIOStream.MyFileReader;

import java.util.Scanner;

public class Head {
    public static void main(String[] args) {
        String fileName = args[0];

        int noOfLines = 10;
        if(args.length == 2) noOfLines = Math.abs(Integer.parseInt(args[1]));

        String fileContent = new MyFileReader().readFile(fileName);


    }
}