package com.myfirst.articlescrollingwithrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {

    private ItemClickListener itemClickListener;
    private ImageView mIvArticle;
    private TextView mTvTitle;
    private TextView mTvAuthor;
    private ConstraintLayout mCvArticle;

    public ArticleViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews();
    }
    void initViews(){
        mIvArticle = itemView.findViewById(R.id.ivArticle);
        mTvTitle = itemView.findViewById(R.id.tvTitle);
        mTvAuthor = itemView.findViewById(R.id.tvAuthor);
        mCvArticle = itemView.findViewById(R.id.cvArticle);
    }
    public void setData(ArticleModel articleModel){
        mIvArticle.setImageResource(articleModel.getArticleImageId());
        mTvTitle.setText(articleModel.getTitle());
        mTvAuthor.setText(articleModel.getAuthor());
        mCvArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(articleModel.getAuthor());
            }
        });
    }
}
