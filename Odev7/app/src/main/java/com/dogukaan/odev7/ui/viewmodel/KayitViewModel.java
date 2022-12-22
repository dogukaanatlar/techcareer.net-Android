package com.dogukaan.odev7.ui.viewmodel;


import androidx.lifecycle.ViewModel;

import com.dogukaan.odev7.data.repo.TodoDaoRepository;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class KayitViewModel extends ViewModel {
    private TodoDaoRepository tdrepo;

    @Inject
    public KayitViewModel(TodoDaoRepository tdrepo){
        this.tdrepo = tdrepo;
    }

    public void kaydet(String todo_name) {
        tdrepo.kaydet(todo_name);
    }
}
