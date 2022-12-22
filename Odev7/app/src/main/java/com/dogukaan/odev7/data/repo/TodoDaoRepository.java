package com.dogukaan.odev7.data.repo;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.dogukaan.odev7.data.entity.Todo;
import com.dogukaan.odev7.room.TodoDao;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class TodoDaoRepository {
    private MutableLiveData<List<Todo>> todoListesi;
    private TodoDao tddao;

    public TodoDaoRepository(TodoDao tddao) {
        this.tddao = tddao;
        todoListesi = new MutableLiveData<>();
    }

    public MutableLiveData<List<Todo>> getTodoListesi() {
        return todoListesi;
    }

    public void todoYukle() {
        tddao.todoYukle()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<Todo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}
                    @Override
                    public void onSuccess(List<Todo> todos) {
                        todoListesi.setValue(todos);
                    }
                    @Override
                    public void onError(Throwable e) {}
                });


    }

    public void kaydet(String todo_name) {
        Todo yeniTodo = new Todo(0,todo_name);
        tddao.kaydet(yeniTodo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}
                    @Override
                    public void onComplete() {}
                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void guncelle(int todo_id, String todo_name) {
        Todo guncellenenTodo = new Todo(todo_id,todo_name);
        tddao.guncelle(guncellenenTodo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}
                    @Override
                    public void onComplete() {}
                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void ara(String aramaKelimesi) {
        tddao.ara(aramaKelimesi)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<Todo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}
                    @Override
                    public void onSuccess(List<Todo> todos) {
                        todoListesi.setValue(todos);
                    }
                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void sil(int todo_id) {
        Todo silinenTodo = new Todo(todo_id, "");
        tddao.sil(silinenTodo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}
                    @Override
                    public void onComplete() {
                        todoYukle();
                    }
                    @Override
                    public void onError(Throwable e) {}
                });
    }
}
