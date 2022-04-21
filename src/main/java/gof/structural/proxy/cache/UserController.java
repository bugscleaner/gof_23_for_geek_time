package gof.structural.proxy.cache;

/**
 * 
 * @since : 2022/4/6
 **/
public class UserController implements IUserController {
    @Override
    public String queryUser() {
        return "no cache";
    }

    @Override
    public void login() {
        System.out.println("login....");
    }
}
