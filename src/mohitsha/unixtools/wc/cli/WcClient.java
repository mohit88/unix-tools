package mohitsha.unixtools.wc.cli;

import mohit.myfilereader.MyFileReader;
import mohitsha.unixtools.wc.WC;

public class WcClient {
	public static void main(String[] args){
		int lines,words,characters;
	    String fileContent = new MyFileReader().readFile(args[0]);
		WC wc = new WC();
		lines = wc.countLines(fileContent);
		words = wc.countWords(fileContent);
		characters = wc.countCharacters(fileContent);
		System.out.println(lines + " " + words + " " + characters + " " + args[0]);
	}
}