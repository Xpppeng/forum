package com.example.forum.domain;

public class Authority {
    private int authorityId;
    private String authorityType;

    public Authority(int authorityId, String authorityType) {
        this.authorityId = authorityId;
        this.authorityType = authorityType;
    }

    public Authority() {
    }

    public int getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(int authorityId) {
        this.authorityId = authorityId;
    }

    public String getAuthorityType() {
        return authorityType;
    }

    public void setAuthorityType(String authorityType) {
        this.authorityType = authorityType;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "authorityId=" + authorityId +
                ", authorityType='" + authorityType + '\'' +
                '}';
    }
}
