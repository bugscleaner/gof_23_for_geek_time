package gof.ocp.queue;

/**
 * 
 * @since : 2022/3/10
 **/
public interface AmqpTemplate {
    void convertAndSend(String var1, String var2, Object var3);
}
