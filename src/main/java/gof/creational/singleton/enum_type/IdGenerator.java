package gof.creational.singleton.enum_type;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 基于枚举类型的单例实现。这种实现方式通过
 * Java 枚举类型本身的特性，保证了实例创建的线程安全性和实例的唯一性。
 * 
 * @since : 2022/4/19
 **/
public enum IdGenerator {
    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
