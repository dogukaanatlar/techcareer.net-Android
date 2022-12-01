package com.dogukaan.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dogukaan.odev4.databinding.FragmentSayfaABinding;


public class sayfaAFragment extends Fragment {
    private FragmentSayfaABinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaABinding.inflate(inflater, container, false);

        binding.buttonGitB.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sayfaBGecis);
        });

        return binding.getRoot();
    }
}