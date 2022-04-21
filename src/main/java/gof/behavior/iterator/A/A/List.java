package gof.behavior.iterator.A.A;

public interface List<E> {
    Iterator iterator();
    int size();
    E get(int i);
    void add(E e);
    void remove(int i);
}
