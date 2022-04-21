package gof.behavior.visitor.A;

/**
 * 
 * 
 **/
public class WordFile extends ResourceFile{
    public WordFile(String filePath) {
        super(filePath);
    }
    @Override
    public void extract2txt() {
//...
        System.out.println("Extract WORD.");
    }
}
