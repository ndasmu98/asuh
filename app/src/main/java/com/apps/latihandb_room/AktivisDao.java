package com.apps.latihandb_room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

/*
    Developed by Ian Herdiansyah - 10117194 - IF5
    on 01-05-2020
 */

@Dao
public interface AktivisDao {

    @Insert
    void TambahAktivis(AktivisEntity aktivisEntity);

    @Delete
    public void HapusAktivis(AktivisEntity aktivisEntity);

    @Query("SELECT * FROM AktivisEntity")
    List<AktivisEntity>tampilSeluruhAktivis();

    @Query("SELECT * FROM AktivisEntity WHERE zonaTugas LIKE :zona")
    List<AktivisEntity>findByZone(String zona);
}
