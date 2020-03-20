package com.example.recyclerviewv228;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv ;
    ArrayList<Cats> cat  = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView)findViewById(R.id.rv_cats);
        cat.add(new Cats("cat1",R.drawable.ic_adjust_black_24dp));
        cat.add(new Cats("cat2",R.drawable.ic_tag_faces_black_24dp));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(cat, new OnclickRecyclerLisener() {
            @Override
            public void onItemClick(String catName) {
                Toast.makeText(MainActivity.this ," Wow " ,Toast.LENGTH_SHORT).show();
            }
        });
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);


    }
}
