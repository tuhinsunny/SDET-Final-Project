package com.campussync.backend.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

import com.campussync.backend.enums.Category;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doubts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "asked_by_user_id")
    private User user;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Enumerated(EnumType.STRING)
    private Category category;

    private LocalDateTime createdAt;
}