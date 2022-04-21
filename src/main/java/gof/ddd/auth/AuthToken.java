package gof.ddd.auth;

import java.util.Map;

/**
 * 
 * @since : 2022/3/10
 **/
public class AuthToken {
    private static final long DEFAULT_EXPIRED_TIME_INTERVAL = 1 * 60 * 1000;

    private String token;

    private long createTime;

    private long expriredTimeInterval = DEFAULT_EXPIRED_TIME_INTERVAL;

    public AuthToken(String token, long createTime) {
        this.token = token;
        this.createTime = createTime;
    }

    public static AuthToken generate(String baseUtl, long createTime, Map<String, String> params) {
        return null;
    }

    public String getToken() {
        return null;
    }

    public boolean isExpired() {
        return false;
    }

    public boolean match(AuthToken authToken) {
        return false;
    }
}
