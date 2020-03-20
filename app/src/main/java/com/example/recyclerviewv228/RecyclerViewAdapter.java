package com.example.recyclerviewv228;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CatsViewHolder> {
    ArrayList<Cats> cat ;
    OnclickRecyclerLisener lisener;
    public RecyclerViewAdapter(ArrayList<Cats> cat, OnclickRecyclerLisener lisener) {
        this.cat = cat;
        this.lisener = lisener;

    }

    @NonNull
    @Override
    public CatsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflate for Elements 10  and return them in v.h , call it for 1 time for every Element on screen 10 .
        //btkhls el E  el awl troh lel tane w hakaza .
       // context c fo2 , hkteb hena c .
       View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_custom_item,null,false);
  // inflate for the full layout (img , tv).     
        CatsViewHolder viewHolder = new CatsViewHolder(v);
        //inflate for elements .
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CatsViewHolder holder, int position) {
        Cats c =  cat.get(position);
        holder.img_cat.setImageResource(c.getImg());  // replace thoose by method in class holder (bind)
        holder.tv_name.setText(c.getName());
        holder.name = c.getName();
     
    }

    @Override
    public int getItemCount() {
        return cat.size();
    }   // extends bt2olo el class dh 3obara 3n v.h
    // holder class for Rv
  class CatsViewHolder extends RecyclerView.ViewHolder{
      TextView tv_name ;
      ImageView img_cat ;
        String name ;
      public CatsViewHolder(@NonNull View itemView) {  // b3t fo2 return v; el obg  3obara 3n layoyt item view 
          super(itemView);
          img_cat = itemView.findViewById(R.id.img_cat);
          tv_name = itemView.findViewById(R.id.tv_name);

          itemView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  lisener.onItemClick(name);
              }
          });
      } 
      
  }  
    
    
}
