package com.lz.www.ambrm.model;

/**
 * Created by Administrator on 2016-05-27.
 */
public class News {
    private int id;
    private String title;
    private String content;
    private int img;

    public News(int id, String title, String content,int img) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }


}
