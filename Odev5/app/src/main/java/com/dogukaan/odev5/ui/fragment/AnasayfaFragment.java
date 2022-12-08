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
    private double sayi1, sayi2;
    private String picker;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.toolbarAnasayfa.setTitle("Hesap Makinesi");

        binding.editTextSayi1.setShowSoftInputOnFocus(false);
        binding.editTextSayi2.setShowSoftInputOnFocus(false);

        binding.button0.setOnClickListener(view -> {
            binding.editTextSayi1.setText(binding.editTextSayi1.getText() + "0");
        });
        binding.button1.setOnClickListener(view -> {
            binding.editTextSayi1.setText(binding.editTextSayi1.getText() + "1");
        });
        binding.button2.setOnClickListener(view -> {
            binding.editTextSayi1.setText(binding.editTextSayi1.getText() + "2");
        });
        binding.button3.setOnClickListener(view -> {
            binding.editTextSayi1.setText(binding.editTextSayi1.getText() + "3");
        });
        binding.button4.setOnClickListener(view -> {
            binding.editTextSayi1.setText(binding.editTextSayi1.getText() + "4");
        });
        binding.button5.setOnClickListener(view -> {
            binding.editTextSayi1.setText(binding.editTextSayi1.getText() + "5");
        });
        binding.button6.setOnClickListener(view -> {
            binding.editTextSayi1.setText(binding.editTextSayi1.getText() + "6");
        });
        binding.button7.setOnClickListener(view -> {
            binding.editTextSayi1.setText(binding.editTextSayi1.getText() + "7");
        });
        binding.button8.setOnClickListener(view -> {
            binding.editTextSayi1.setText(binding.editTextSayi1.getText() + "8");
        });
        binding.button9.setOnClickListener(view -> {
            binding.editTextSayi1.setText(binding.editTextSayi1.getText() + "9");
        });
        binding.buttonNokta.setOnClickListener(view -> {
            if (binding.editTextSayi1.getText().toString().contains(".") == true) {
                Snackbar.make(view, "Tekrar nokta koyamazsınız!", Snackbar.LENGTH_SHORT).show();
            } else {
                binding.editTextSayi1.setText(binding.editTextSayi1.getText() + ".");
            }
        });

        binding.buttonTopla.setOnClickListener(view -> {
            sayi1 = Double.parseDouble(binding.editTextSayi1.getText().toString());
            //Log.e("Sayılar Toplam ", String.valueOf(sayi1));
            binding.editTextSayi1.setText("");
            //double sayi2 = Double.parseDouble(binding.editTextSayi2.getText().toString());
            //Log.e("Sayılar Toplam ", String.valueOf(sayi1));
            picker = "topla";
            binding.editTextSayi2.setText("İlk Sayı : " + sayi1);
        });

        binding.buttonTemizle.setOnClickListener(view -> {
            binding.editTextSayi1.setText(null);
            binding.editTextSayi2.setText(null);
            binding.textView.setText(null);
        });

        binding.buttonEsit.setOnClickListener(view -> {
            if (picker.equals("topla")) {
                topla(sayi1);
            }
        });

        return binding.getRoot();
    }

    public void topla(double sayi1) {
        //Log.e("Sayılar Toplam ", sayi1 + " - " + Double.parseDouble(binding.editTextSayi1.getText().toString()));
        double topla = sayi1 + Double.parseDouble(binding.editTextSayi1.getText().toString());
        //Log.e("Toplam : ", String.valueOf(topla));
        binding.textView.setText("Sonuç: " + topla);
    }

}