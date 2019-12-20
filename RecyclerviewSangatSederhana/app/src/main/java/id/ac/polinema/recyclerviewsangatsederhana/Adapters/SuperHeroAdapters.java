package id.ac.polinema.recyclerviewsangatsederhana.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.Models.SuperHero;

public class SuperHeroAdapters extends RecyclerView.Adapter<SuperHeroAdapters.MyViewHolder>{
    List<SuperHero> heroList;

    public SuperHeroAdapters(List<SuperHero> heroList) {
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public SuperHeroAdapters.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View superHeroView = layoutInflater.inflate(R.layout.item_super_hero,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(superHeroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SuperHeroAdapters.MyViewHolder holder, int position) {
        id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero hero = heroList.get(position);
        holder.heroName.setText(hero.getHeroName());
    }

    @Override
    public int getItemCount() {
        return (heroList != null) ? heroList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView heroName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            heroName = itemView.findViewById(R.id.heroName);
        }
    }
}