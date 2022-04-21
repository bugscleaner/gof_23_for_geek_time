package gof.behavior.observer.C;

import com.google.common.eventbus.Subscribe;

public class RegNotificationObserver implements RegObserver {
    private NotificationService notificationService;

    @Override
    @Subscribe
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}
