package com.lz.www.ambrm.model;

import java.util.Date;

/**
 * Created by Administrator on 2016-05-27.
 */
public class News {
    private int ID;
    private String Title;
    private String Content;
    private String AddTime;
    private String Author;
    private String Url;
    private String ImgUrl;
    private Boolean IsTop;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getAddTime() {
        return AddTime;
    }

    public void setAddTime(String addTime) {
        AddTime = addTime;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }

    public Boolean getTop() {
        return IsTop;
    }

    public void setTop(Boolean top) {
        IsTop = top;
    }

    public News(){

    }

    public News(int ID, String title, String content) {
        this.ID = ID;
        Title = title;
        Content = content;
    }
}
