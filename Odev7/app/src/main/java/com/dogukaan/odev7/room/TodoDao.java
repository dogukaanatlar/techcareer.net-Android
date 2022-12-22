package com.dogukaan.odev7.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dogukaan.odev7.data.entity.Todo;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface TodoDao {
    @Query("SELECT * FROM todos")
    Single<List<Todo>> todoYukle();

    @Query("SELECT * FROM todos WHERE todo_name like '%' || :aramaKelimesi || '%'")
    Single<List<Todo>> ara(String aramaKelimesi);

    @Delete
    Completable sil(Todo todo);

    @Insert
    Completable kaydet(Todo todo);

    @Update
    Completable guncelle(Todo todo);
}
