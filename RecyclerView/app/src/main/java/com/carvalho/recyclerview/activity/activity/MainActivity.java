package com.carvalho.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.carvalho.recyclerview.R;
import com.carvalho.recyclerview.activity.adapter.Adapter;
import com.carvalho.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes
        this.criarFilmes();

        //Configurar adapter
        Adapter adapter = new Adapter(listaFilmes);

        //Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager((getApplicationContext()));
        
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);//otimização
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        // recyclerView.setAdapter();
        recyclerView.setAdapter(adapter);


        //Evento de clique

//        recyclerView.addOnItemTouchListener(
////            new RecyclerItemClickListener(
////                    getApplicationContext(),
////                    recyclerView,
////                    new RecyclerItemClickListener
////
////            )
//        );
    }

    public void criarFilmes() {
        Filme filme = new Filme("Homem Aranha - De volta ao lar", "Aventura", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Mulher Maravilha", "Fantasia", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Liga da Justiça", "Fantasia", "2017");
        this.listaFilmes.add(filme);


        filme = new Filme("Capitão América - Guerra Civil", "Aventura", "2016");
        this.listaFilmes.add(filme);

        filme = new Filme("It a coisa", "Terror", "2016");
        this.listaFilmes.add(filme);

        filme = new Filme("As panteras", "Suspense", "2019");
        this.listaFilmes.add(filme);

        filme = new Filme("Poderoso chefão", "Drama", "2019");
        this.listaFilmes.add(filme);

        filme = new Filme("Homem formiga", "Aventura", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Star treck", "Fantasia", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Quarteto fantástico", "Fantasia", "2017");
        this.listaFilmes.add(filme);


        filme = new Filme("Motoqueiro fatasma", "Aventura", "2016");
        this.listaFilmes.add(filme);

        filme = new Filme("It a coisa 2", "Terror", "2016");
        this.listaFilmes.add(filme);

        filme = new Filme("As panteras 2", "Suspense", "2019");
        this.listaFilmes.add(filme);

        filme = new Filme("Poderoso chefão 6", "Drama", "2019");
        this.listaFilmes.add(filme);
    }
}