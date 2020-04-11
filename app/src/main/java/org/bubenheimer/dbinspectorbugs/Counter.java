package org.bubenheimer.dbinspectorbugs;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public final class Counter {
    @PrimaryKey
    private final int value;
    public int getValue(
    ) {
        return value;
    }

    Counter(
            final int value
    ) {
        this.value = value;
    }
}
