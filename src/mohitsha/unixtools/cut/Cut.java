package mohitsha.unixtools.cut;


import mohit.myfilereader.MyFileReader;
import mohitsha.unixtools.cut.cutLib.CutInputLib;

public class Cut {

    public static void main(String[] args) {

        CutInputLib cutInput = new CutInputLib();
        cutInput.getInput(args);
        String output = null;
        String fileContent = new MyFileReader().readFile(cutInput.getFileName());
        if(cutInput.isFieldCheck()) output = cutInput.getOnlyFields(fileContent);
        System.out.println(output);
    }
}