package gof.structural.adapter.collections;

public class Emueration {
    public boolean hasMoreElments() {
        return false;
    }

    public Object nextElement() {
        return new Object();
    }
}
