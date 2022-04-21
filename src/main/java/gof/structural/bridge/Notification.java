package gof.structural.bridge;

/**
 * 
 * @since : 2022/4/7
 **/
public abstract class Notification {
    private MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
