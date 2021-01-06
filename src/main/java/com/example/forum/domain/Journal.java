package com.example.forum.domain;

import java.sql.Timestamp;

public class Journal {
    private int joId;
    private int joCount;
    private Timestamp joTime;
    private String aUNname;

    public Journal() {
    }

    public Journal(int joId, int joCount, Timestamp joTime, String aUNname) {
        this.joId = joId;
        this.joCount = joCount;
        this.joTime = joTime;
        this.aUNname = aUNname;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "joId=" + joId +
                ", joCount=" + joCount +
                ", joTime=" + joTime +
                ", aUNname='" + aUNname + '\'' +
                '}';
    }

    public int getJoId() {
        return joId;
    }

    public void setJoId(int joId) {
        this.joId = joId;
    }

    public int getJoCount() {
        return joCount;
    }

    public void setJoCount(int joCount) {
        this.joCount = joCount;
    }

    public Timestamp getJoTime() {
        return joTime;
    }

    public void setJoTime(Timestamp joTime) {
        this.joTime = joTime;
    }

    public String getaUNname() {
        return aUNname;
    }

    public void setaUNname(String aUNname) {
        this.aUNname = aUNname;
    }
}
