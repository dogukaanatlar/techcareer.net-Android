package com.dogukaan.odev7.data.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "todos")
public class Todo implements Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "todo_id")
    @NonNull
    private int todo_id;
    @ColumnInfo(name = "todo_name")
    @NonNull
    private String todo_name;

    public Todo() {
    }

    public Todo(int todo_id, @NonNull String todo_name) {
        this.todo_id = todo_id;
        this.todo_name = todo_name;
    }

    public int getTodo_id() {
        return todo_id;
    }

    public void setTodo_id(int todo_id) {
        this.todo_id = todo_id;
    }

    @NonNull
    public String getTodo_name() {
        return todo_name;
    }

    public void setTodo_name(@NonNull String todo_name) {
        this.todo_name = todo_name;
    }
}
