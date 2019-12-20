package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import id.ac.polinema.recyclerviewsangatsederhana.Models.SuperHero;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSuperHero;

    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSuperHero = findViewById(R.id.rvSuperHero);

        String [] arr = {"Petruk","Gareng"};
        SuperHero hero;

        for (int i = 0; i < arr.length; i++){
            hero = new SuperHero(arr[i]);
            listSuperHero.add(hero);
        }
        SuperHeroAdapters superHeroAdapters = new SuperHeroAdapters(listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapters);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}