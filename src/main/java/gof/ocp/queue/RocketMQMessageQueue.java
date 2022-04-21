package gof.ocp.queue;

/**
 * 
 * @since : 2022/3/10
 **/
public class RocketMQMessageQueue implements MessageQueue{
    private AmqpTemplate amqpTemplate;

    public RocketMQMessageQueue(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    @Override
    public void sendMessage() {
        amqpTemplate.convertAndSend(null, null, null);
    }
}
