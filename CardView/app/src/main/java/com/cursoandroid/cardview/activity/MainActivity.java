package com.cursoandroid.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cursoandroid.cardview.R;
import com.cursoandroid.cardview.adapter.PostagemAdapter;
import com.cursoandroid.cardview.model.Postagem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager((this));
        recyclerPostagem.setLayoutManager(layoutManager);

        //define adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);

    }

    public void prepararPostagens(){
        Postagem p = new Postagem("Jamilton Damasceno", "#tbt viagem legal", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Hotel JM", "Viage, aproveite nossos descontos.", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Maria Luiza", "#Paris!!.", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Marcos Paulo", "Que foto linda!!", R.drawable.imagem4);
        this.postagens.add(p);
    }
}