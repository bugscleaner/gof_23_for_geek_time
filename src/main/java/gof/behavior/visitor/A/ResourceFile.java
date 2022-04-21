package gof.behavior.visitor.A;

/**
 * 
 * 
 **/
public abstract class ResourceFile {
    protected String filePath;
    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    public abstract void extract2txt();
}
