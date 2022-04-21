package gof.behavior.chain.E;

public class HandlerB implements IHandler {
    @Override
    public void handle() {
        System.out.println("传递到HandlerB了");
    }
}
