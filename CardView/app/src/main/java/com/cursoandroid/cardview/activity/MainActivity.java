package com.cursoandroid.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cursoandroid.cardview.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager((this));
        recyclerPostagem.setLayoutManager(layoutManager);

        //define adapter
        //recyclerPostagem.setAdapter();
    }
}