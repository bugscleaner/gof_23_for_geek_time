package gof.ocp.v2;

/**
 * 
 * @since : 2022/3/10
 **/
public class Demo {
    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();

        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
