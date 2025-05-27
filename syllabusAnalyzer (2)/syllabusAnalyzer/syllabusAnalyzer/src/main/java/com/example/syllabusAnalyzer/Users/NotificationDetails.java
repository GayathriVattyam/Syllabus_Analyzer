package com.example.syllabusAnalyzer.Users;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class NotificationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notify_id;

    private Long user_id;
    private String message;
    private boolean is_read;
    private Date created_at = new Date();

    // Getters and Setters
    public Long getNotify_id() {
        return notify_id;
    }

    public void setNotify_id(Long notify_id) {
        this.notify_id = notify_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIs_read() {
        return is_read;
    }

    public void setIs_read(boolean is_read) {
        this.is_read = is_read;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}
