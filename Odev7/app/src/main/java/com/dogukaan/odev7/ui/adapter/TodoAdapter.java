package com.dogukaan.odev7.ui.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.dogukaan.odev7.R;
import com.dogukaan.odev7.data.entity.Todo;
import com.dogukaan.odev7.databinding.CardTasarimBinding;
import com.dogukaan.odev7.ui.fragment.AnasayfaFragmentDirections;
import com.dogukaan.odev7.ui.viewmodel.AnasayfaViewModel;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Todo> todoListesi;
    private AnasayfaViewModel viewModel;

    public TodoAdapter(Context mContext, List<Todo> todoListesi, AnasayfaViewModel viewModel) {
        this.mContext = mContext;
        this.todoListesi = todoListesi;
        this.viewModel = viewModel;
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
        CardTasarimBinding binding =
                DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.card_tasarim, parent, false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Todo todo = todoListesi.get(position);
        CardTasarimBinding t = holder.binding;
        t.setTodoNesnesi(todo);

        t.satirCard.setOnClickListener(view -> {
            AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(todo);
            Navigation.findNavController(view).navigate(gecis);
        });

        t.imageViewSil.setOnClickListener(view -> {
            Snackbar.make(view, todo.getTodo_name() + " silinsin mi?", Snackbar.LENGTH_LONG)
                    .setAction("EVET", view1 -> {
                        viewModel.sil(todo.getTodo_id());
                    }).show();
        });
    }

    @Override
    public int getItemCount() {
        return todoListesi.size();
    }
}
