package gof.ddd.auth;

/**
 * 
 * @since : 2022/3/10
 **/
public abstract class CredentialStorage {
    public abstract String getPasswordByAppId(String appId);
}
