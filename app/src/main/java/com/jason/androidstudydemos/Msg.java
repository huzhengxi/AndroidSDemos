package com.jason.androidstudydemos;

public class Msg {
    private int profile;
    private String nickname;
    private String content;
    private boolean like;


    public Msg(int profile, String nickname, String content, boolean like) {
        this.profile = profile;
        this.nickname = nickname;
        this.content = content;
        this.like = like;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }
}
