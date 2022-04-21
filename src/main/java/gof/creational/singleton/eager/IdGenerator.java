package gof.creational.singleton.eager;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉式的实现方式比较简单。在类加载的时候，instance 静态实例就已经创建并初始化好
 * 了，所以，instance 实例的创建过程是线程安全的。不过，这样的实现方式不支持延迟加
 * 载（在真正用到 IdGenerator 的时候，再创建实例），从名字中我们也可以看出这一点。
 * 具体的代码实现如下所示：
 * 
 * @since : 2022/4/19
 **/
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();
    private IdGenerator() {}

    public static IdGenerator getInstance() {
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}
