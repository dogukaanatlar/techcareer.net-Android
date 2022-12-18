package com.dogukaan.odev6.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dogukaan.odev6.R;
import com.dogukaan.odev6.data.entity.Oyunlar;
import com.dogukaan.odev6.databinding.FragmentDetayBinding;

public class DetayFragment extends Fragment {
    private FragmentDetayBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetayBinding.inflate(getLayoutInflater());
        return binding.getRoot();


    }
}