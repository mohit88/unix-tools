package mohitsha.unixtools.wc.cli;
import mohitsha.unixtools.wc.WC;

import java.io.*;

public class WcClient {
	public static void main(String[] args){
		int lines,words,characters;
		char [] array = new char[50];
		try{
			File file = new File(args[0]);
		    FileReader fr = new FileReader(file);
	        char [] a = new char[50];
	      	fr.read(a);
	      	int index = 0;
	      	for(char c : a){
	      	  array[index] = c;
	          index++;
	        }
	        fr.close();
	    }
	    catch(Exception e) {
	    	System.out.println("Error");
	    }
	    String text = new String(array);
		WC operations = new WC();
		lines = operations.countLines(text);
		words = operations.countWords(text);
		characters = operations.countCharacters(text);
		System.out.println(lines + " " + words + " " + characters + " " + args[0]);
	}
}