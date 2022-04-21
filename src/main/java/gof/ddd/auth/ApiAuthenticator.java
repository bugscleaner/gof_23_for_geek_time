package gof.ddd.auth;

/**
 * 
 * @since : 2022/3/10
 **/
public interface ApiAuthenticator {
    void auth(String url);

    void auth(ApiRequest apiRequest);
}
