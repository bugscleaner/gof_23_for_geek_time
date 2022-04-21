package gof.structural.bridge;

/**
 * 
 * @since : 2022/4/7
 **/
public class EmailMsgSender implements MsgSender{
    private Email email;

    public EmailMsgSender(Email email) {
        this.email = email;
    }

    @Override
    public void sendMsg(Content content) {

    }
}
