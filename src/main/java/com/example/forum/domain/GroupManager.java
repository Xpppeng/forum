package com.example.forum.domain;

public class GroupManager {
    private int groupMangerId;
    private String groupMangerRole;

    public GroupManager() {
    }

    public GroupManager(int groupMangerId, String groupMangerRole) {
        this.groupMangerId = groupMangerId;
        this.groupMangerRole = groupMangerRole;
    }

    public int getGroupMangerId() {
        return groupMangerId;
    }

    public void setGroupMangerId(int groupMangerId) {
        this.groupMangerId = groupMangerId;
    }

    public String getGroupMangerRole() {
        return groupMangerRole;
    }

    public void setGroupMangerRole(String groupMangerRole) {
        this.groupMangerRole = groupMangerRole;
    }

    @Override
    public String toString() {
        return "GroupManager{" +
                "groupMangerId=" + groupMangerId +
                ", groupMangerRole='" + groupMangerRole + '\'' +
                '}';
    }
}
