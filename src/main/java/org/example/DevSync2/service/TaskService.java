package org.example.DevSync2.service;

import org.example.DevSync2.entity.Task;
import org.example.DevSync2.repository.TaskRepository;

import java.util.List;

public class TaskService {

    private final TaskRepository taskRepository = new TaskRepository();

    public boolean save(Task task) {
        return taskRepository.save(task);
    }

    public boolean delete(Task task) {
        return taskRepository.delete(task);
    }

    public boolean update(Task task) {
        return taskRepository.update(task);
    }

    public Task findById(Long id) {
        return taskRepository.findById(id);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }



}
