package com.dogukaan.odev7.ui.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.dogukaan.odev7.data.entity.Todo;
import com.dogukaan.odev7.data.repo.TodoDaoRepository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class AnasayfaViewModel extends ViewModel {
    private TodoDaoRepository tdrepo;
    public MutableLiveData<List<Todo>> todoListesi = new MutableLiveData<>();

    @Inject
    public AnasayfaViewModel(TodoDaoRepository tdrepo){
        this.tdrepo = tdrepo;
        todoYukle();
        todoListesi = tdrepo.getTodoListesi();
    }

    public void ara(String aramaKelimesi) {
        tdrepo.ara(aramaKelimesi);
    }

    public void sil(int todo_id) {
        tdrepo.sil(todo_id);
    }

    public void todoYukle(){
        tdrepo.todoYukle();
    }
}
