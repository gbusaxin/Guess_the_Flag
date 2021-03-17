package com.example.guesstheflag.roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;

@Dao
public interface FlagsDAO {

    @Insert
    Completable insertFlags(Flags flags);

    @Delete
    Completable deleteFlags(Flags flags);

    @Update
    Completable updateFlags(Flags flags);

    @Query("SELECT * FROM flags")
    Flowable<List<Flags>> getAll();

    @Query("SELECT * FROM flags WHERE id = :id")
    public Single<Flags> loadFlagById(int id);

}
