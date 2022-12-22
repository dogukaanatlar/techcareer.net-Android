package com.dogukaan.odev7.ui.viewmodel;


import androidx.lifecycle.ViewModel;

import com.dogukaan.odev7.data.repo.TodoDaoRepository;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class DetayViewModel extends ViewModel {
    private TodoDaoRepository tdrepo;

    @Inject
    public DetayViewModel(TodoDaoRepository tdrepo){
        this.tdrepo = tdrepo;
    }

    public void guncelle(int todo_id, String todo_name) {
        tdrepo.guncelle(todo_id, todo_name);
    }
}
