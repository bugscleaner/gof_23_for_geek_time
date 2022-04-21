package gof.structural.proxy.cache;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 利用动态代理缓存查询
 * 场景，是否需要缓存由下游决定，但可以把从缓存获取数据的逻辑解耦合出来
 *
 * 
 * @since : 2022/4/6
 **/
public class CacheProxy {
    private Cache cache;
    private Boolean cacheFlag;
    public CacheProxy(String key, Boolean cache){
        this.cache = new Cache(key);
        this.cacheFlag = cache;
    }

    public Object createProxy(Object proxiedObject){
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, handler);
    }

    private class DynamicProxyHandler implements InvocationHandler {
        private Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject){
            this.proxiedObject = proxiedObject;
        }


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (cacheFlag){
                Object cacheObject = cache.queryCacheByKey();
                if (cacheFlag != null){
                    return cacheObject;
                }
            }
            return method.invoke(proxiedObject, args);
        }
    }
}
