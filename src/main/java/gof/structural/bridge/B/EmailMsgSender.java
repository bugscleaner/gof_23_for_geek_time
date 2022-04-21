package gof.structural.bridge.B;

import java.util.List;

public class EmailMsgSender implements MsgSender {
    private List<String> emailAddresses;

    public EmailMsgSender(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    @Override
    public void send(String message) {

    }
}
