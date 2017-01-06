package com.lin.entity;

public class Voter {
    private Integer voterId;

    private String ip;

    private String position;

    private String major;

    private Integer grade;

    private Integer classes;

    private Integer themeId;
    private VoteTheme voteTheme;

    public VoteTheme getVoteTheme() {
		return voteTheme;
	}

	public void setVoteTheme(VoteTheme voteTheme) {
		this.voteTheme = voteTheme;
	}

	public Integer getVoterId() {
        return voterId;
    }

    public void setVoterId(Integer voterId) {
        this.voterId = voterId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getClasses() {
        return classes;
    }

    public void setClasses(Integer classes) {
        this.classes = classes;
    }

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", ip=" + ip + ", position="
				+ position + ", major=" + major + ", grade=" + grade
				+ ", classes=" + classes + ", themeId=" + themeId
				+ ", voteTheme=" + voteTheme + "]";
	}
    
}