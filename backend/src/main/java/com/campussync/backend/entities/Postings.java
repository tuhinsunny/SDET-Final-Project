package com.campussync.backend.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

import com.campussync.backend.enums.SharingType;
import com.campussync.backend.enums.Status;
import com.campussync.backend.enums.TenantPreference;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Postings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "posted_by_user_id")
    private User user;

    private String pgName;
    private String address;
    private String officeCampus;

    @Enumerated(EnumType.STRING)
    private SharingType sharingType;

    @Enumerated(EnumType.STRING)
    private TenantPreference tenantPreference;

    private Double rentAmount;

    private int foodRating;
    private String foodReview;

    private int serviceRating;
    private String serviceReview;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime expiresAt;
}