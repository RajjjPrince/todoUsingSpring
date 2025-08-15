package com.app.todoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private boolean completed;

//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setCompleted(boolean b) {
//        this.completed = completed;
//    }
//
//    public boolean isCompleted() {
//        return completed;
//    }


}
