package com.example.syllabusAnalyzer.Users;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_progress")
public class UserProgressDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pro_id;

    private Long user_id;
    private Long topic_id;
    private int complete_subtopic;
    private int total_subtopic;

    @Temporal(TemporalType.TIMESTAMP)
    private Date last_updated;

    public UserProgressDetails() {}

    // Getters and Setters
    public Long getPro_id() {
        return pro_id;
    }

    public void setPro_id(Long pro_id) {
        this.pro_id = pro_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Long topic_id) {
        this.topic_id = topic_id;
    }

    public int getComplete_subtopic() {
        return complete_subtopic;
    }

    public void setComplete_subtopic(int complete_subtopic) {
        this.complete_subtopic = complete_subtopic;
    }

    public int getTotal_subtopic() {
        return total_subtopic;
    }

    public void setTotal_subtopic(int total_subtopic) {
        this.total_subtopic = total_subtopic;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }
}
