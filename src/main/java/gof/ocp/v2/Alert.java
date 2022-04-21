package gof.ocp.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 
 * @since : 2022/3/10
 **/
public class Alert {
    private List<AlertHandler> alertHandlerList;

    public void check(ApiStatInfo apiStatInfo){
        for (AlertHandler alertHandler : alertHandlerList){
            alertHandler.check(apiStatInfo);
        }
    }

    public void addAlertHandler(AlertHandler alertHandler){
        if (alertHandler == null){
            return;
        }
        this.alertHandlerList = Optional.ofNullable(alertHandlerList).orElseGet(ArrayList::new);
        alertHandlerList.add(alertHandler);
    }
}
