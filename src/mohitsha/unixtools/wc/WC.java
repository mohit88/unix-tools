package mohitsha.unixtools.wc;

public class WC {
    public int countLines(String text) {
        String[] result = text.split("\n");
        return result.length;
    }

    public int countWords(String text) {
        String[] result = text.split(" ");
        return result.length;
    }

    public int countCharacters(String text) {
        String[] result = text.split("");
        return result.length;
    }
}