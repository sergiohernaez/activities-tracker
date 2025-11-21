package com.sergiohernaez.activitiesTracker.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Long id;

    @OneToMany(mappedBy="authorUserId")
    private List<Post> items;

    @ManyToMany(mappedBy = "likes")
    List<Post> likes;

    @OneToMany(mappedBy="userId")
    private List<Activity> activities;
}
