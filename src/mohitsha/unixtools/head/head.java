package mohitsha.unixtools.head;

import mohit.myfilereader.MyFileReader;

import java.util.Scanner;

public class Head {
    public static void main(String[] args) {
        String fileName = args[0];

        int noOfLines = 10;
        if(args.length == 2) noOfLines = Math.abs(Integer.parseInt(args[1]));

        String fileContent = new MyFileReader().readFile(fileName);
        Scanner contentScanner = new Scanner(fileContent);

        int index = 0;
        while(index < noOfLines && contentScanner.hasNextLine()){
            System.out.println(contentScanner.nextLine());
            index++;
        }
        contentScanner.close();
    }
}