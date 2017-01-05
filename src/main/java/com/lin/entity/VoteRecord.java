package com.lin.entity;

public class VoteRecord {
    private Integer record;

    private Integer voteDate;

    private Integer themeId;

    private Integer voterId;
    
    
    /** 
     * vote_record表中有一个theme_id字段，所以在VoteRecord类中定义一个voteRecord属性， 
     * 用于维护voteTheme和voteRecord之间的一对一关系，通过这个voteTheme属性就可以知道这个记录的主题 
     */  
    private VoteTheme voteTheme;
    
    private Voter voter;
   

	public Voter getVoter() {
		return voter;
	}

	public void setVoter(Voter voter) {
		this.voter = voter;
	}

	public VoteTheme getVoteTheme() {
		return voteTheme;
	}

	public void setVoteTheme(VoteTheme voteTheme) {
		this.voteTheme = voteTheme;
	}

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

	@Override
	public String toString() {
		return "VoteRecord [record=" + record + ", voteDate=" + voteDate
				+ ", themeId=" + themeId + ", voterId=" + voterId
				+ ", voteTheme=" + voteTheme + ", voter=" + voter + "]";
	}

	
}