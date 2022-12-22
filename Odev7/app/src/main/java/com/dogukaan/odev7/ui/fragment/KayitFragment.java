package com.dogukaan.odev7.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dogukaan.odev7.R;
import com.dogukaan.odev7.databinding.FragmentKayitBinding;
import com.dogukaan.odev7.ui.viewmodel.KayitViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class KayitFragment extends Fragment {
    private FragmentKayitBinding binding;
    private KayitViewModel viewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_kayit, container, false);
        binding.setKayitToolbarBaslik("Kaydet");
        binding.setKayitFragment(this);


        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(KayitViewModel.class);
    }

    public void kaydet(String todo_name) {
        viewModel.kaydet(todo_name);
    }
}