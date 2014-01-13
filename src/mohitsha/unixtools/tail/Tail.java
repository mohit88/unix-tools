package mohitsha.unixtools.tail;

import mohit.myfilereader.MyFileReader;

import java.util.Scanner;

public class Tail{
    void printLines(String[] lines,int start,int end){
        for (int index = start; index < end; index++){
            System.out.println(lines[index]);
        }
    }

    public static void main(String[] args) {
        Tail tail = new Tail();

        String fileName = new String(args[0]);

        int noOfLines = 10;
        if(args.length == 2) noOfLines = Integer.parseInt(args[1]) * -1;

        String fileContent = new MyFileReader().readFile(fileName);
        String[] lines = fileContent.split("\n");

        int length = lines.length;

        if(length < noOfLines ) noOfLines = length;
        tail.printLines(lines, length - noOfLines, length);
    }
}
