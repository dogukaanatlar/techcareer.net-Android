package com.dogukaan.odev7.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.dogukaan.odev7.data.entity.Todo;

@Database(entities = {Todo.class},version = 1)
public abstract class Veritabani extends RoomDatabase {
    public abstract TodoDao getTodoDao();
}
