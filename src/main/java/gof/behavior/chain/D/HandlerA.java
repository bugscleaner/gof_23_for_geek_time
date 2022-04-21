package gof.behavior.chain.D;

public class HandlerA extends Handler {
    @Override
    public void doHandler() {
        System.out.println("传递到HandlerA了");
    }
}
