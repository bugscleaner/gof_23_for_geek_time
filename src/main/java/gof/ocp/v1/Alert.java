package gof.ocp.v1;

/**
 * 
 * @since : 2022/3/10
 **/
public class Alert {
    private AlertRule alertRule;

    private Notification notification;

    public Alert(AlertRule alertRule, Notification notification) {
        this.alertRule = alertRule;
        this.notification = notification;
    }

    public void check(String api, long requestCount, long errorCount, long timeoutCount){
        long tps = requestCount / errorCount;
        if (tps > alertRule.getMatchedRule(api).getMaxTps()){
            notification.notify(NotificationEmergencyLevel.URGENCY);
        }

        if (errorCount > alertRule.getMatchedRule(api).getMaxErrorCount()){
            notification.notify(NotificationEmergencyLevel.SEVERE);
        }

        if (timeoutCount > alertRule.getMatchedRule(api).getTimeoutCount()){
            notification.notify(NotificationEmergencyLevel.URGENCY);
        }
    }
}
