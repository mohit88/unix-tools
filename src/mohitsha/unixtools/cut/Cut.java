package mohitsha.unixtools.cut;


import mohit.myfilereader.MyFileReader;
import mohitsha.unixtools.cut.cutLib.CutInputLib;

public class Cut {

    public static void main(String[] args) {

        CutInputLib cutInput = new CutInputLib();
        cutInput.getInput(args);
        String fileContent = new MyFileReader().readFile(cutInput.getFileName());
        System.out.println(cutInput.isCharacterCheck());
        System.out.println(cutInput.isFieldCheck());
        System.out.println(cutInput.getStart());

    }
}