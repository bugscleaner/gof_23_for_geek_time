package gof.behavior.visitor.C;

/**
 * 
 * 
 **/
public class Compressor implements Visitor{
    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("Compress PDF.");
    }
}
