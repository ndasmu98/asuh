package com.apps.latihandb_room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/*
    Developed by Ian Herdiansyah - 10117194 - IF5
    on 01-05-2020
 */

@Database(entities = {com.apps.latihandb_room.AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract com.apps.latihandb_room.AktivisDao aktivisDao();
}
