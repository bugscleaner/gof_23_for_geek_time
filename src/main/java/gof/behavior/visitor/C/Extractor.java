package gof.behavior.visitor.C;

/**
 * 
 * 
 **/
public class Extractor implements Visitor{
    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("Extract PDF.");
    }
}
