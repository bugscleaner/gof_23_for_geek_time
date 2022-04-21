package gof.behavior.iterator.B.B;

public interface List<E> {
    Iterator iterator();

    int size();

    E get(int i);

    void add(E e);

    void remove(E obj);
}
