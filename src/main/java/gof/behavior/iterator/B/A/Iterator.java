package gof.behavior.iterator.B.A;

public interface Iterator<E> {
    boolean hasNext();

    E next();

    E currentItem();
}
