package gof.structural.proxy.A;


/**
 * UserControllerProxy使用举例
 * 因为原始类和代理类实现相同的接口，是基于接口而非实现编程
 * 将UserController类对象替换为UserControllerProxy类对象，不需要改动太多代码
 */
public class Demo {
    public static void main(String[] args) {
        IUserController userController = new UserControllerProxy(new UserController());
        //基于组合的静态代理。可以对原始类的子类也进行代理
        IUserController userControllerB = new UserControllerProxy(new UserControllerB());
        userController.login("13607841111", "123456");
    }
}