package gof.behavior.chain.D;

public class HandlerB extends Handler {
    @Override
    public void doHandler() {
        System.out.println("传递到HandlerB了");
    }
}
