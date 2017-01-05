package com.lin.entity;

public class VoteRecord {
    private Integer record;

    private Integer voteDate;

    private Integer themeId;

    private Integer voterId;

    public Integer getRecord() {
        return record;
    }

    public void setRecord(Integer record) {
        this.record = record;
    }

    public Integer getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(Integer voteDate) {
        this.voteDate = voteDate;
    }

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    public Integer getVoterId() {
        return voterId;
    }

    public void setVoterId(Integer voterId) {
        this.voterId = voterId;
    }
}