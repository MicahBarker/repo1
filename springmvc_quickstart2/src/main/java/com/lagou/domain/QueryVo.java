package com.lagou.domain;

import java.util.List;
import java.util.Map;

/**
 * @Author 青科大-任安全
 * @Create 2024/4/23 20:53
 */
public class QueryVo {
    private String keyword;
    private User user;
    private List<User> userList;
    private Map<String, User> userMap;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "keyword='" + keyword + '\'' +
                ", user=" + user +
                ", userList=" + userList +
                ", userMap=" + userMap +
                '}';
    }
}