package org.bubenheimer.dbinspectorbugs;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public abstract class CounterDao {
    @Insert
    abstract void insert(
            Counter entity
    );
}
