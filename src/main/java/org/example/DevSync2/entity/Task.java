package org.example.DevSync2.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime; // For handling date and time
import java.util.List;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    private LocalDateTime dueDate;

    @ManyToMany(mappedBy = "tasks")
    private List<Tag> tags;
}
