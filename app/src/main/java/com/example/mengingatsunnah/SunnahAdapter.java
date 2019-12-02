package com.example.mengingatsunnah;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SunnahAdapter extends RecyclerView.Adapter<SunnahAdapter.SunnahHolder> {

    private ArrayList<ModelSunnah> listData;

    public SunnahAdapter(ArrayList<ModelSunnah> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public SunnahAdapter.SunnahHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.raw_list, viewGroup, false);
        return new SunnahHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SunnahAdapter.SunnahHolder SunnahHolder, int i) {
        SunnahHolder.bindView(listData.get(i));

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class SunnahHolder extends RecyclerView.ViewHolder {

        private TextView  Judul, subJudul;
        private ImageView ivMain;

        public SunnahHolder(@NonNull View itemView) {
            super(itemView);
            Judul = itemView.findViewById(R.id.tvJudul);
            subJudul = itemView.findViewById(R.id.tvSubJudul);
            ivMain = itemView.findViewById(R.id.ivMain);

        }

        private void bindView(ModelSunnah data)  {
            Judul.setText(data.getJudul());
            subJudul.setText(data.getSubjudul());
            ivMain.setImageResource(data.getGambar());
            final String idSunnah = data.getId();

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), DetailSunnah.class)
                            .putExtra(DetailSunnah.KEY_SUNNAH, idSunnah));
                }
            });
        }

    }
}
