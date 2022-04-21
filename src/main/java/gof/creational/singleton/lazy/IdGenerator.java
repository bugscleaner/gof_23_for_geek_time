package gof.creational.singleton.lazy;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 有饿汉式，对应地，就有懒汉式。懒汉式相对于饿汉式的优势是支持延迟加载
 * 
 * @since : 2022/4/19
 **/
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;
    private IdGenerator() {}


    //不过懒汉式的缺点也很明显，我们给 getInstance() 这个方法加了一把大锁
    //（synchronzed），导致这个函数的并发度很低。量化一下的话，并发度是 1，也就相当于
    //串行操作了。而这个函数是在单例使用期间，一直会被调用。如果这个单例类偶尔会被用
    //到，那这种实现方式还可以接受。但是，如果频繁地用到，那频繁加锁、释放锁及并发度低
    //等问题，会导致性能瓶颈，这种实现方式就不可取了。
    public static synchronized IdGenerator getInstance() {
        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}
