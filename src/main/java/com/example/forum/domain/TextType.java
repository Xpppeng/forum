package com.example.forum.domain;

public class TextType {
    private int textTypeId;
    private String textTypeContent;
    private int textTypeLeft;
    private int textTypeRight;

    @Override
    public String toString() {
        return "TextType{" +
                "textTypeId=" + textTypeId +
                ", textTypeContent='" + textTypeContent + '\'' +
                ", textTypeLeft=" + textTypeLeft +
                ", textTypeRight=" + textTypeRight +
                '}';
    }

    public int getTextTypeId() {
        return textTypeId;
    }

    public void setTextTypeId(int textTypeId) {
        this.textTypeId = textTypeId;
    }

    public String getTextTypeContent() {
        return textTypeContent;
    }

    public void setTextTypeContent(String textTypeContent) {
        this.textTypeContent = textTypeContent;
    }

    public int getTextTypeLeft() {
        return textTypeLeft;
    }

    public void setTextTypeLeft(int textTypeLeft) {
        this.textTypeLeft = textTypeLeft;
    }

    public int getTextTypeRight() {
        return textTypeRight;
    }

    public void setTextTypeRight(int textTypeRight) {
        this.textTypeRight = textTypeRight;
    }

    public TextType(int textTypeId, String textTypeContent, int textTypeLeft, int textTypeRight) {
        this.textTypeId = textTypeId;
        this.textTypeContent = textTypeContent;
        this.textTypeLeft = textTypeLeft;
        this.textTypeRight = textTypeRight;
    }

    public TextType() {
    }
}
