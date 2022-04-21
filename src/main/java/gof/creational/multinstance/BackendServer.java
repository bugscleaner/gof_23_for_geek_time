package gof.creational.multinstance;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 
 * @since : 2022/4/19
 **/
public class BackendServer {
    private static final int SERVER_COUNT = 3;
    private static final Map<Long, BackendServer> serverInstances = new HashMap<>();

    private long serverNo;
    private String serverAddress;

    private BackendServer(long serverNo, String serverAddress) {
        this.serverNo = serverNo;
        this.serverAddress = serverAddress;
    }


    static {
        serverInstances.put(1L, new BackendServer(1L, "192.134.22.138:8080"));
        serverInstances.put(2L, new BackendServer(2L, "192.134.22.139:8080"));
        serverInstances.put(3L, new BackendServer(3L, "192.134.22.140:8080"));
    }

    public BackendServer getInstance() {
        Random random = new Random();
        int no = random.nextInt(SERVER_COUNT + 1);
        return serverInstances.get(no);
    }
}
