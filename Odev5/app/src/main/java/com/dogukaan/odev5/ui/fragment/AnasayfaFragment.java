package com.dogukaan.odev5.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dogukaan.odev5.R;
import com.dogukaan.odev5.databinding.FragmentAnasayfaBinding;
import com.google.android.material.snackbar.Snackbar;


public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.toolbarAnasayfa.setTitle("Hesap Makinesi");


        binding.buttonTopla.setOnClickListener(view -> {
            if (!TextUtils.isEmpty(binding.editTextSayi1.getText().toString()) && !TextUtils.isEmpty(binding.editTextSayi2.getText().toString())) {
                double sayi1 = Double.parseDouble(binding.editTextSayi1.getText().toString());
                double sayi2 = Double.parseDouble(binding.editTextSayi2.getText().toString());
                topla(sayi1, sayi2);
            } else {
                Snackbar.make(view, "Eksik Sayı Girildi!", Snackbar.LENGTH_SHORT).show();
            }
        });

        binding.buttonTemizle.setOnClickListener(view -> {
            binding.editTextSayi1.setText(null);
            binding.editTextSayi2.setText(null);
            binding.textView.setText(null);
        });

        return binding.getRoot();
    }

    public void topla(double sayi1, double sayi2) {
        Log.e("Sayılar Toplam ", sayi1 + " - " + sayi2);
        double topla = sayi1 + sayi2;
        Log.e("Toplam : ", String.valueOf(topla));
        binding.textView.setText("Sonuç: " + topla);
    }
}