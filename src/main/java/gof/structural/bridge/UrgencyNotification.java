package gof.structural.bridge;

/**
 * 
 * @since : 2022/4/7
 **/
public class UrgencyNotification extends Notification{
    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {

    }
}
