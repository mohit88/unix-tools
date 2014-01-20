package mohitsha.unixtools.lib;

import java.util.Arrays;
import java.util.Comparator;

public class SortLib {
    private String concatAllLines(String[] lines) {
        StringBuilder sortLines = new StringBuilder("");
        for (String line : lines) {
            sortLines.append(line);
            sortLines.append("\n");
        }
        return sortLines.substring(0, sortLines.length() - 1);
    }

    public String simpleSort(String content) {
        String[] lines = content.split("\n");
        Arrays.sort(lines);
        return concatAllLines(lines);
    }

    public String reverseSort(String content) {
        String[] lines = content.split("\n");
        Arrays.sort(lines, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        return concatAllLines(lines);
    }
}
