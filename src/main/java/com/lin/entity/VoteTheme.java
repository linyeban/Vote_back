package com.lin.entity;

public class VoteTheme {
    private Integer themeId;

    private String title;

    private String createDate;

    private String endDate;

    private Integer type;

    private Integer publish;

    private String positionY;

    private String majorY;

    private Integer gradeY;

    private Integer classY;

    private Integer adminId;

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPublish() {
        return publish;
    }

    public void setPublish(Integer publish) {
        this.publish = publish;
    }

    public String getPositionY() {
        return positionY;
    }

    public void setPositionY(String positionY) {
        this.positionY = positionY == null ? null : positionY.trim();
    }

    public String getMajorY() {
        return majorY;
    }

    public void setMajorY(String majorY) {
        this.majorY = majorY == null ? null : majorY.trim();
    }

    public Integer getGradeY() {
        return gradeY;
    }

    public void setGradeY(Integer gradeY) {
        this.gradeY = gradeY;
    }

    public Integer getClassY() {
        return classY;
    }

    public void setClassY(Integer classY) {
        this.classY = classY;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}