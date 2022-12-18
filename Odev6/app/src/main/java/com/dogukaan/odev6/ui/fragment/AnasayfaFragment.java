package com.dogukaan.odev6.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.dogukaan.odev6.R;
import com.dogukaan.odev6.data.entity.Oyunlar;
import com.dogukaan.odev6.databinding.ActivityMainBinding;
import com.dogukaan.odev6.databinding.FragmentAnasayfaBinding;
import com.dogukaan.odev6.ui.adapter.OyunlarAdapter;

import java.util.ArrayList;

public class AnasayfaFragment extends Fragment implements SearchView.OnQueryTextListener {
    private FragmentAnasayfaBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);


        //((AppCompatActivity)getActivity()).setSupportActionBar(binding.toolbarAnasayfa);


        binding.rv.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

        ArrayList<Oyunlar> oyunlarListesi = new ArrayList<>();
        Oyunlar o1 = new Oyunlar(1, "God of War", "godofwar", 2022, 197.40, "PlayStation PC LLC");
        Oyunlar o2 = new Oyunlar(2, "Assassin's Creed Valhalla", "assasins", 2022, 230.67, "Ubisoft");
        Oyunlar o3 = new Oyunlar(3, "House Flipper", "houseflipper", 2018, 8.00, "Frozen District, PlayWay S.A.");
        Oyunlar o4 = new Oyunlar(4, "STAR WARS Jedi", "jedi", 2019, 33.59, "Electronic Arts");
        Oyunlar o5 = new Oyunlar(5, "New World", "newworld", 2021, 88.75, "Amazon Games");
        Oyunlar o6 = new Oyunlar(6, "Sniper Ghost Warrior Contracts 2", "sniper", 2021, 103.59, "CI Games");
        oyunlarListesi.add(o1);
        oyunlarListesi.add(o2);
        oyunlarListesi.add(o3);
        oyunlarListesi.add(o4);
        oyunlarListesi.add(o5);
        oyunlarListesi.add(o6);

        OyunlarAdapter adapter = new OyunlarAdapter(requireContext(),oyunlarListesi);
        binding.rv.setAdapter(adapter);
        //----------------------
        binding.rv2.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        ArrayList<Oyunlar> oyunlarListesi2 = new ArrayList<>();
        Oyunlar o7 = new Oyunlar(7, "Dying Light 2", "dying", 2022, 174.50, "Techland");
        Oyunlar o8 = new Oyunlar(8, "Deep Rock Galactic", "deeprock", 2020, 51.15, "Coffee Stain Publishing");
        Oyunlar o9 = new Oyunlar(9, "FIFA 23", "fifa23", 2022, 279.99, "Electronic Arts");
        Oyunlar o10 = new Oyunlar(10, "Call of Duty: Modern Warfare II", "callof", 2022, 934.15, "Activision");
        Oyunlar o11 = new Oyunlar(11, "NARAKA: BLADEPOINT", "naraka", 2021, 64.99, "NetEase Games Global");
        Oyunlar o12 = new Oyunlar(12, "Mount & Blade II: Bannerlord", "mountblade", 2022, 244.99, "TaleWorlds Entertainment");
        oyunlarListesi2.add(o7);
        oyunlarListesi2.add(o8);
        oyunlarListesi2.add(o9);
        oyunlarListesi2.add(o10);
        oyunlarListesi2.add(o11);
        oyunlarListesi2.add(o12);

        OyunlarAdapter adapter2 = new OyunlarAdapter(requireContext(),oyunlarListesi2);

        binding.rv2.setAdapter(adapter2);

        /*requireActivity().addMenuProvider(new MenuProvider() {
            @Override
            public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
                menuInflater.inflate(R.menu.toolbar_menu, menu);

                MenuItem item = menu.findItem(R.id.action_ara);
                SearchView searchView = (SearchView) item.getActionView();
                searchView.setOnQueryTextListener(AnasayfaFragment.this);
            }
            @Override
            public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
                return false;
            }
        },getViewLifecycleOwner(), Lifecycle.State.RESUMED);*/

        return binding.getRoot();
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        ara(query);
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        ara(newText);
        return true;
    }

    public void ara(String aramaKelimesi){

    }
}