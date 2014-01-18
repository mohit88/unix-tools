package mohitsha.myIOStream;

import java.util.Scanner;

public class MyStdInputReader {
    public String takeInput(){
        Scanner in = new Scanner(System.in);
        String input = "";
        while(in.hasNextLine())
            input += in.nextLine() + "\n";
        in.close();
        return input;
    }
}
