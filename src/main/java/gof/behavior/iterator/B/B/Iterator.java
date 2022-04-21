package gof.behavior.iterator.B.B;

public interface Iterator<E> {
    boolean hasNext();

    E next();

    E currentItem();
}
