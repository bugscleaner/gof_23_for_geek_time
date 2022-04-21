package gof.structural.bridge;

/**
 * 
 * @since : 2022/4/7
 **/
public class QQMsgSender implements MsgSender{
    private QQ qq;

    public QQMsgSender(QQ qq) {
        this.qq = qq;
    }

    @Override
    public void sendMsg(Content content) {

    }
}
