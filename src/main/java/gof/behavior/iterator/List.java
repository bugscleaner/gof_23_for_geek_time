package gof.behavior.iterator;

public interface List<E> {
    Iterator iterator();
    int size();
    E get(int i);
    void add(E e);
}
