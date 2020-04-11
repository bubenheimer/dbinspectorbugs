package org.bubenheimer.dbinspectorbugs;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class FGSvc extends Service {
    @Override
    public void onCreate() {
        super.onCreate();

        final Notification notification =
                new Notification.Builder(this, getString(R.string.channelid))
                        .setOngoing(true)
                        .setContentTitle("Foreground service in progress")
                        .setSmallIcon(R.drawable.ic_stat_name)
                        .build();
        startForeground(R.id.notification_id_service, notification);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    @Override
    public IBinder onBind(
            final Intent intent
    ) {
        return null;
    }
}
