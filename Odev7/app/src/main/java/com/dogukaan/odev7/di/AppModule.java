package com.dogukaan.odev7.di;


import android.content.Context;

import androidx.room.Room;

import com.dogukaan.odev7.data.repo.TodoDaoRepository;
import com.dogukaan.odev7.room.TodoDao;
import com.dogukaan.odev7.room.Veritabani;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {
    @Provides
    @Singleton
    public TodoDaoRepository provideTodoDaoRepository(TodoDao tddao){
        return new TodoDaoRepository(tddao);
    }

    @Provides
    @Singleton
    public TodoDao provideTodoDao(@ApplicationContext Context context){
        Veritabani vt = Room.databaseBuilder(context,Veritabani.class,"toDos.sqlite")
                .createFromAsset("toDos.sqlite").build();
        return vt.getTodoDao();
    }
}
