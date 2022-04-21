package gof.structural.proxy.cache;

/**
 * 
 * @since : 2022/4/6
 **/
public class Cache {
    private String key;

    public Cache(String key) {
        this.key = key;
    }

    public Object queryCacheByKey(){
        if (key != null && !key.isEmpty()){
            return "cache";
        }
        return null;
    }
}
