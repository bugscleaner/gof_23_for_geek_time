package gof.structural.proxy.cache;


/**
 * 
 * @since : 2022/4/6
 **/
public class ConfigController {
    public void receive(Boolean cache){
        CacheProxy cacheProxy = new CacheProxy("redis:key", cache);
        IUserController userController = (IUserController) cacheProxy.createProxy(new UserController());
        System.out.println(userController.queryUser());
    }

    public static void main(String[] args) {
        ConfigController configController = new ConfigController();
        configController.receive(Boolean.FALSE);
    }
}
