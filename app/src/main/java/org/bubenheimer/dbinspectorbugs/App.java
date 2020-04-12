package org.bubenheimer.dbinspectorbugs;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;

import java.util.Random;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        final NotificationChannel channel = new NotificationChannel(
                getString(R.string.channelid),
                "Bad channel",
                NotificationManager.IMPORTANCE_LOW);
        channel.setDescription("Very bad channel");
        channel.enableLights(false);
        channel.enableVibration(false);
        channel.setShowBadge(true);
        getSystemService(NotificationManager.class).createNotificationChannel(channel);

        final DB db = Room
                .databaseBuilder(this, DB.class, "exploredb")
                .setJournalMode(RoomDatabase.JournalMode.TRUNCATE)
                .build();
        new Thread(() -> db.counterDao().insert(new Counter(new Random().nextInt()))).start();
    }
}
