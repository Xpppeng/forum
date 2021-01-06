package com.example.forum.domain;

public class Reply {
    private int rId;
    private Text textId;
    private String rCotent;

    public Reply() {
    }

    public Reply(int rId, Text textId, String rCotent) {
        this.rId = rId;
        this.textId = textId;
        this.rCotent = rCotent;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "rId=" + rId +
                ", textId=" + textId +
                ", rCotent='" + rCotent + '\'' +
                '}';
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public Text getTextId() {
        return textId;
    }

    public void setTextId(Text textId) {
        this.textId = textId;
    }

    public String getrCotent() {
        return rCotent;
    }

    public void setrCotent(String rCotent) {
        this.rCotent = rCotent;
    }
}
