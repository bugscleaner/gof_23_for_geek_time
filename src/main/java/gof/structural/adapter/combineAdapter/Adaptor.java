package gof.structural.adapter.combineAdapter;

public class Adaptor implements ITarget {
    private Adaptee adaptee;

    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        adaptee.fb();
    }

    @Override
    public void fc() {
        adaptee.fc();
    }
}
