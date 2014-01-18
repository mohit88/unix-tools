package mohitsha.unixtools.cli;

import mohitsha.myIOStream.MyFileReader;
import mohitsha.unixtools.lib.WC;

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