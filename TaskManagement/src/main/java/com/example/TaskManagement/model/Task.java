package com.example.TaskManagement.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="task")
public class Task{
//    id BIGINT AUTO_INCREMENT PRIMARY KEY,
//    title VARCHAR(255) NOT NULL,
//    description TEXT,
//    due_date DATETIME,
//    priority_level VARCHAR(50),
//    assigned_to VARCHAR(100),
//    status VARCHAR(50)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;
    @Column(name="due_date")
    private LocalDateTime due_date;
    @Column(name="priority_level")
    private String priority_level;
    @Column(name="assigned_to")
    private String assigned_to;
    @Column(name="status")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDue_date() {
        return due_date;
    }

    public void setDue_date(LocalDateTime due_date) {
        this.due_date = due_date;
    }

    public String getPriority_level() {
        return priority_level;
    }

    public void setPriority_level(String priority_level) {
        this.priority_level = priority_level;
    }

    public String getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Task(Long id, String title, String description, LocalDateTime due_date, String priority_level, String assigned_to, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.due_date = due_date;
        this.priority_level = priority_level;
        this.assigned_to = assigned_to;
        this.status = status;
    }
    public Task(){}

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", due_date=" + due_date +
                ", priority_level='" + priority_level + '\'' +
                ", assigned_to='" + assigned_to + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
