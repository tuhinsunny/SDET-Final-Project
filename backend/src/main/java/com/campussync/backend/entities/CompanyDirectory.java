package com.campussync.backend.entities;

import com.campussync.backend.enums.IdType;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDirectory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String cognizantId;

    @Enumerated(EnumType.STRING)
    private IdType idType;

    private boolean isRegistered = false;

    @OneToOne(mappedBy = "companyDirectory")
    private User user;
}
