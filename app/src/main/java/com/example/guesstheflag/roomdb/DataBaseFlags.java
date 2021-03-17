package com.example.guesstheflag.roomdb;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executors;

@Database(entities = (Flags.class),version = 1)
public abstract class DataBaseFlags extends RoomDatabase {

   private static DataBaseFlags INSTANCE;

   public abstract FlagsDAO flagsDAO();

   public synchronized static DataBaseFlags getInstance(Context context){
       if (INSTANCE == null){

       }
       return INSTANCE;
   }


   private static DataBaseFlags buildDataBase(final Context context){
       return Room.databaseBuilder(context,
               DataBaseFlags.class,
               "flagsDB")
               .addCallback(new Callback() {
                   @Override
                   public void onCreate(@NonNull SupportSQLiteDatabase db) {
                       super.onCreate(db);
                   }

                   @Override
                   public void onOpen(@NonNull SupportSQLiteDatabase db) {
                       super.onOpen(db);
                   }
               });
   }
}
