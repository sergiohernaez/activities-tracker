package com.sergiohernaez.activitiesTracker.infrastructure.repository;

import com.sergiohernaez.activitiesTracker.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
