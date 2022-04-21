package gof.behavior.iterator.A.B;

public interface Iterator<E> {
    boolean hasNext();

    E next();

    E currentItem();
}
