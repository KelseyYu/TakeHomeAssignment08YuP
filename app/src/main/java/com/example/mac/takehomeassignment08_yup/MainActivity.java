package com.example.mac.takehomeassignment08_yup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Cuisine> cuisines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this) );
        recyclerView.setAdapter(new CuisineAdapter(cuisines,this) );


    }
    private void initialData(){
        cuisines = new ArrayList<>();
        cuisines.add(new Cuisine(R.string.mapo_tofu, R.drawable.mapo_tofu,true));
        cuisines.add(new Cuisine(R.string.dumplings, R.drawable.dumplings, false));
        cuisines.add(new Cuisine(R.string.kungpao_chicken,R.drawable.kungpao_chicken,true));
        cuisines.add(new Cuisine(R.string.twice_cooked_pork,R.drawable.twice_cooked_pork,true) );
        cuisines.add(new Cuisine(R.string.spring_rolls,R.drawable.spring_rolls,false));
        cuisines.add(new Cuisine(R.string.sweet_sour_pork,R.drawable.sweet_sour_pork,false));
        cuisines.add(new Cuisine(R.string.noddles,R.drawable.noodles,true));
    }
}
