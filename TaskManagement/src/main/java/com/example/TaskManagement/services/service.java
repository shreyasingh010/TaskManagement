package com.example.TaskManagement.services;

import com.example.TaskManagement.model.Task;

import java.util.List;
import java.util.Optional;

public interface service {
    Task createTask(Task task);
    List<Task> getAllTasks();
    Optional<Task> getTaskById(Long id);
    Task updateTask(Long id, Task updatedTask);
    void deleteTask(Long id);
}
