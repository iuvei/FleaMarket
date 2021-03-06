package com.fleamarket.core.model;

import java.sql.Date;
import java.util.Objects;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String username;

    private String password;

    private String nickname;

    @Column(name = "create_time")
    private java.util.Date createTime;

    private String photo;

    private String tel;

    private String email;

    private String sex;
    @Column(name = "birthday")
    private Date birthday;

    private String city;

    private String school;

    private String signature;

    /**
     * 0：锁定、1：正常
     */
    private Integer status;

    @Column(name = "star_count")
    private Integer starCount;

    @Column(name = "like_count")
    private Integer likeCount;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return create_time
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * @param signature
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * 获取0：锁定、1：正常
     *
     * @return status - 0：锁定、1：正常
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0：锁定、1：正常
     *
     * @param status 0：锁定、1：正常
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return star_count
     */
    public Integer getStarCount() {
        return starCount;
    }

    /**
     * @param starCount
     */
    public void setStarCount(Integer starCount) {
        this.starCount = starCount;
    }

    /**
     * @return like_count
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * @param likeCount
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(nickname, user.nickname) &&
                Objects.equals(createTime, user.createTime) &&
                Objects.equals(photo, user.photo) &&
                Objects.equals(tel, user.tel) &&
                Objects.equals(email, user.email) &&
                Objects.equals(sex, user.sex) &&
                Objects.equals(birthday, user.birthday) &&
                Objects.equals(city, user.city) &&
                Objects.equals(school, user.school) &&
                Objects.equals(signature, user.signature) &&
                Objects.equals(status, user.status) &&
                Objects.equals(starCount, user.starCount) &&
                Objects.equals(likeCount, user.likeCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, nickname, createTime, photo, tel, email, sex, birthday, city, school, signature, status, starCount, likeCount);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}