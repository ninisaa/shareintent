package com.example.user.pahlawanapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<HeroesModel> listHero  = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_hero_list);
        recyclerView.setHasFixedSize(true);
        listHero.addAll(DataHero.getListHero());
        showRecyclerList();
    }
    
    private void showRecyclerList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        HeroesAdapter heroesAdapter = new HeroesAdapter(this);
        heroesAdapter.setHeroesModels(listHero);
        recyclerView.setAdapter(heroesAdapter);
    }
}
