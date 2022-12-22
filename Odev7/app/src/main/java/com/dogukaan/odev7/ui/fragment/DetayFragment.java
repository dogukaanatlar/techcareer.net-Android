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
import com.dogukaan.odev7.data.entity.Todo;
import com.dogukaan.odev7.databinding.FragmentDetayBinding;
import com.dogukaan.odev7.ui.viewmodel.DetayViewModel;
import com.dogukaan.odev7.ui.viewmodel.KayitViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class DetayFragment extends Fragment {
    private FragmentDetayBinding binding;
    private DetayViewModel viewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detay, container, false);

        binding.setDetayToolbarBaslik("Detay");

        DetayFragmentArgs bundle = DetayFragmentArgs.fromBundle(getArguments());
        Todo gelenTodo = bundle.getTodo();
        binding.setTodoNesnesi(gelenTodo);

        binding.setDetayFragment(this);

        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(DetayViewModel.class);
    }

    public void guncelle(int todo_id, String todo_name) {
        viewModel.guncelle(todo_id, todo_name);
    }
}