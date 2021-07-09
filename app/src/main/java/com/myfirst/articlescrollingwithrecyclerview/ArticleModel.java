package com.myfirst.articlescrollingwithrecyclerview;

public class ArticleModel {
    private int articleImageId;
    private String title;
    private String author;
    public ArticleModel(int articleImageId,String title,String author){
        this.articleImageId = articleImageId;
        this.title = title;
        this.author = author;
    }

    public int getArticleImageId() {
        return articleImageId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}
