package com.myfirst.articlescrollingwithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private RecyclerView mRecyclerView;
    private ArrayList<ArticleModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);
        setData();
        ArticleAdapter articleAdapter = new ArticleAdapter(arrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setAdapter(articleAdapter);
        mRecyclerView.setLayoutManager(linearLayoutManager);
    }

    private void setData() {
        arrayList = new ArrayList<>();
        arrayList.add(new ArticleModel(R.drawable.article1,"1. The Purpose Of Life " +
                "Is Not Happiness: It’s Usefulness","Darius Foroux"));
        arrayList.add(new ArticleModel(R.drawable.article2,"2. What it Means to Serve Others" +
                " — The Mark of a Servant Leader","Christopher Connors"));
        arrayList.add(new ArticleModel(R.drawable.article3,"3. Changing Culture: Shift " +
                "Small Habits for Big Wins","Alison Randel"));
        arrayList.add(new ArticleModel(R.drawable.article4,"5. Relax Dude — Take It" +
                " Easy On Yourself", "Johan Rosen"));
        arrayList.add(new ArticleModel(R.drawable.article5,"How You Can Be A Better" +
                " Leader Today","iNahid"));
    }

    @Override
    public void onItemClick(String author) {
        Toast.makeText(this,author,Toast.LENGTH_SHORT).show();
    }
}