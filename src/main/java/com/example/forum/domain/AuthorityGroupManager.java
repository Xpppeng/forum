package com.example.forum.domain;

public class AuthorityGroupManager {
  private int amgId;
  private GroupManager grId;
  private Authority auId;

    public AuthorityGroupManager() {
    }

    public AuthorityGroupManager(int amgId, GroupManager grId, Authority auId) {
        this.amgId = amgId;
        this.grId = grId;
        this.auId = auId;
    }

    public int getAmgId() {
        return amgId;
    }

    public void setAmgId(int amgId) {
        this.amgId = amgId;
    }

    public GroupManager getGrId() {
        return grId;
    }

    public void setGrId(GroupManager grId) {
        this.grId = grId;
    }

    public Authority getAuId() {
        return auId;
    }

    public void setAuId(Authority auId) {
        this.auId = auId;
    }

    @Override
    public String toString() {
        return "AuthorityGroupManager{" +
                "amgId=" + amgId +
                ", grId=" + grId +
                ", auId=" + auId +
                '}';
    }
}
