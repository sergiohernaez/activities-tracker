package com.sergiohernaez.activitiesTracker;

import com.sergiohernaez.activitiesTracker.domain.Post;
import com.sergiohernaez.activitiesTracker.controller.dto.PostDTO;

import java.time.LocalDate;

public class TestUtils {

    public static Post getTeam() {
        return Post.builder().id(1L).name("Example0").dateOfCreation(LocalDate.now()).championshipsWon(1L).entryFeePaid(true).build();
    }

    public static Post getTeamWithoutId() {
        return Post.builder().id(null).name("Example0").dateOfCreation(LocalDate.now()).championshipsWon(1L).entryFeePaid(true).build();
    }

    public static PostDTO getTeamDto() {
        return PostDTO.builder().id(1L).name("Example0").yearOfCreation(String.valueOf(LocalDate.now().getYear())).championshipsWon(1L).entryFeePaid(true).build();
    }

    public static PostDTO getTeamDtoWithoutId() {
        return PostDTO.builder().id(null).name("Example0").yearOfCreation(String.valueOf(LocalDate.now().getYear())).championshipsWon(1L).entryFeePaid(true).build();
    }
}
