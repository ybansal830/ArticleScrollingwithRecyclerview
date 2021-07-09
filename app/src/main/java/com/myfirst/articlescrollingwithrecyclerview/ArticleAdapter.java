package com.myfirst.articlescrollingwithrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleViewHolder> {

    private ArrayList<ArticleModel> arrayList;
    private ItemClickListener itemClickListener;

    public ArticleAdapter(ArrayList<ArticleModel> arrayList,ItemClickListener itemClickListener){
        this.arrayList = arrayList;
        this.itemClickListener = itemClickListener;
    }
    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_article,parent,false);
        return new ArticleViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
        ArticleModel articleModel = arrayList.get(position);
        holder.setData(articleModel);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
