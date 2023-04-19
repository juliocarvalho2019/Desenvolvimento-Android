package com.cursoandroid.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cursoandroid.cardview.R;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhe, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.textNome.setText("Júlio Carvalho");
    holder.textPostagem.setText("#tbt Viagem legal!");
    holder.textImagem.setImageResource(R.drawable.imagem1);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView textNome;
        private TextView textPostagem;
        private ImageView textImagem;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.recyclerPostagem);
            textImagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}
