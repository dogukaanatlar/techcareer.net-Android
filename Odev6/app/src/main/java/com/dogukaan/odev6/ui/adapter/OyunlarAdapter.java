package com.dogukaan.odev6.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dogukaan.odev6.data.entity.Oyunlar;
import com.dogukaan.odev6.databinding.CardTasarimBinding;

import java.util.List;

public class OyunlarAdapter extends RecyclerView.Adapter<OyunlarAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Oyunlar> oyunlarListesi;

    public OyunlarAdapter(Context mContext, List<Oyunlar> oyunlarListesi) {
        this.mContext = mContext;
        this.oyunlarListesi = oyunlarListesi;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardTasarimBinding binding;

        public CardTasarimTutucu(CardTasarimBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Oyunlar oyunlar = oyunlarListesi.get(position);
        CardTasarimBinding t = holder.binding;

        t.imageViewOyun.setImageResource(mContext.getResources().getIdentifier(oyunlar.getResimAdi(), "drawable", mContext.getPackageName()));

        t.textViewOyunIsim.setText(oyunlar.getAd());
        t.textViewOyun.setText(oyunlar.getFiyat() + " TL");
    }

    @Override
    public int getItemCount() {
        return oyunlarListesi.size();
    }
}
