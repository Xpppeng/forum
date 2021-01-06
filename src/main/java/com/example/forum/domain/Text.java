package com.example.forum.domain;

public class Text {
    private int textId;
    private String aUName;
    private int textCount;
    private String textContent;
    private TextType textTypeid;

    public Text() {
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public String getaUName() {
        return aUName;
    }

    public void setaUName(String aUName) {
        this.aUName = aUName;
    }

    public int getTextCount() {
        return textCount;
    }

    public void setTextCount(int textCount) {
        this.textCount = textCount;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public TextType getTextTypeid() {
        return textTypeid;
    }

    public void setTextTypeid(TextType textTypeid) {
        this.textTypeid = textTypeid;
    }

    @Override
    public String toString() {
        return "Text{" +
                "textId=" + textId +
                ", aUName='" + aUName + '\'' +
                ", textCount=" + textCount +
                ", textContent='" + textContent + '\'' +
                ", textTypeid=" + textTypeid +
                '}';
    }

    public Text(int textId, String aUName, int textCount, String textContent, TextType textTypeid) {
        this.textId = textId;
        this.aUName = aUName;
        this.textCount = textCount;
        this.textContent = textContent;
        this.textTypeid = textTypeid;
    }
}
