package com.lin.entity;

import java.util.List;

public class Admin {
    private Integer adminId;

    private String name;

    private String password;

    private String logintime;
    
    private List<VoteTheme> voteTheme;

  
	public List<VoteTheme> getVoteTheme() {
		return voteTheme;
	}

	public void setVoteTheme(List<VoteTheme> voteTheme) {
		this.voteTheme = voteTheme;
	}

	public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime == null ? null : logintime.trim();
    }
  
    @Override
  	public String toString() {
  		return "Admin [adminId=" + adminId + ", name=" + name + ", password="
  				+ password + ", logintime=" + logintime + ", voteTheme="
  				+ voteTheme + "]";
  	}

}