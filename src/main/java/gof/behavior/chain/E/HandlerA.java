package gof.behavior.chain.E;

public class HandlerA implements IHandler {
    @Override
    public void handle() {
        System.out.println("传递到HandlerA了");
    }
}
