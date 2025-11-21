package com.sergiohernaez.activitiesTracker.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="post")
public class Post {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Long id;

    @Column(name="title", nullable=false)
    private String title;

    @Column(name="description", nullable=false)
    private String description;

    @CreationTimestamp
    @Column(name="createdAt", nullable=false)
    private LocalDate createdAt;

    @UpdateTimestamp
    @Column(name="updatedAt", nullable=false)
    private LocalDate updatedAt;

    @ManyToOne
    @JoinColumn(name="authorUserId", nullable=false)
    private User authorUserId;

    @ManyToMany
    @JoinTable(
            name = "like",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    List<User> likes;

    @OneToMany(mappedBy="postId")
    private List<Activity> activities;

}
