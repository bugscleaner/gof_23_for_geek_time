package gof.creational.singleton.doublecheck;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉式不支持延迟加载，懒汉式有性能问题，不支持高并发。那我们再来看一种既支持延迟
 * 加载、又支持高并发的单例实现方式，也就是双重检测实现方式。
 * 在这种实现方式中，只要 instance 被创建之后，即便再调用 getInstance() 函数也不会再
 * 进入到加锁逻辑中了。所以，这种实现方式解决了懒汉式并发度低的问题
 * 
 * @since : 2022/4/19
 **/
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;
    private IdGenerator() {}

    public static IdGenerator getInstance() {
        if (instance == null){
            synchronized (IdGenerator.class){ // 此处为类级别的锁
                if (instance == null){
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
