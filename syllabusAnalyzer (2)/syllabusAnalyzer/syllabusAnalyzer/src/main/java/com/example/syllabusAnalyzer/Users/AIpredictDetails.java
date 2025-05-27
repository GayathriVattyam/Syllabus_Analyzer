package com.example.syllabusAnalyzer.Users;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AIpredictDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pred_id;

    private Long user_id;
    private Long top_id;
    private String pred_table;
    private String pred_comp;
    private String pred_horizon;
    private LocalDateTime createdAt;

    public Long getPred_id() {
        return pred_id;
    }

    public void setPred_id(Long pred_id) {
        this.pred_id = pred_id;
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

    public String getPred_table() {
        return pred_table;
    }

    public void setPred_table(String pred_table) {
        this.pred_table = pred_table;
    }

    public String getPred_comp() {
        return pred_comp;
    }

    public void setPred_comp(String pred_comp) {
        this.pred_comp = pred_comp;
    }

    public String getPred_horizon() {
        return pred_horizon;
    }

    public void setPred_horizon(String pred_horizon) {
        this.pred_horizon = pred_horizon;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
