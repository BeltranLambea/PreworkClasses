package com.packages;

import java.util.Date;

public class Book {
    private String title;
    private String author;
    private int length;

    private boolean read;
    private Date createdDate;

    //getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getLength() {
        return length;
    }

    public boolean isRead() {
        return read;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLength(int length) {
        if (length < 101){
            this.length = 101;
        }else{
            this.length = length;
        }
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    //constructors
    public Book(String title, String author, int length) {
        setTitle(title);
        setAuthor(author);
        setLength(length);
        this.read = false;
        this.createdDate = new Date();
    }

    public Book(String title, String author, int length, boolean read) {
        setTitle(title);
        setAuthor(author);
        setLength(length);
        setRead(read);
        this.createdDate = new Date();
    }

}
