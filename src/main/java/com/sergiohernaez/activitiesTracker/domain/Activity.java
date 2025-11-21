package com.sergiohernaez.activitiesTracker.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="activity")
public class Activity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Long id;

    @ManyToOne
    @JoinColumn(name="userId", nullable=false)
    private User userId;

    @ManyToOne
    @JoinColumn(name="postId", nullable=false)
    private Post postId;

    @Column(name="operation", nullable = false)
    private Operation operation;

    @CreationTimestamp
    @Column(name="occurredAt", nullable=false)
    private LocalDate occurredAt;

}
