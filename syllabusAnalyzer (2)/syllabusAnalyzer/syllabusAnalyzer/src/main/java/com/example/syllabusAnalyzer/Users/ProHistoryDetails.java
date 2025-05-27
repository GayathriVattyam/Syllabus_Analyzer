package com.example.syllabusAnalyzer.Users;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "progress_history")
public class ProHistoryDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long his_id;

    private Long user_id;
    private Long top_id;
    private Date date;
    private int complete_subtopic;
    private int total_subtopic;

    // Getters and Setters

    public Long getHis_id() {
        return his_id;
    }

    public void setHis_id(Long his_id) {
        this.his_id = his_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getTop_id() {
        return top_id;
    }

    public void setTop_id(Long top_id) {
        this.top_id = top_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
}
