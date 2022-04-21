package gof.behavior.iterator.A.A;

public interface Iterator<E> {
    boolean hasNext();

    void next();

    E currentItem();
}
