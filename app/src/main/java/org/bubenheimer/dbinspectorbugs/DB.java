package org.bubenheimer.dbinspectorbugs;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(
        entities = Counter.class,
        version = 1,
        exportSchema = false
)
public abstract class DB extends RoomDatabase {
    public abstract CounterDao counterDao();
}
