package com.sergiohernaez.activitiesTracker;

import com.sergiohernaez.activitiesTracker.service.PostService;
import com.sergiohernaez.activitiesTracker.infrastructure.mapper.PostMapper;
import com.sergiohernaez.activitiesTracker.infrastructure.repository.PostRepository;
import com.sergiohernaez.activitiesTracker.controller.dto.PostDTO;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@SpringBootTest
class TeamTest {

	@Mock
	PostRepository teamRepository;

	@Mock
	PostMapper teamMapper;

	@InjectMocks
	PostService teamUseCase;

	@Test
	void success_when_getTeams() {
		when(teamRepository.findAll()).thenReturn(List.of(TestUtils.getTeam()));
		when(teamMapper.teamToDto(TestUtils.getTeam())).thenReturn(TestUtils.getTeamDto());

		List<PostDTO> teams = teamUseCase.getTeams();

		assertEquals(teams.get(0).getId(),TestUtils.getTeam().getId());

	}

	@Test
	void success_when_addTeam() {
		when(teamRepository.save(TestUtils.getTeamWithoutId())).thenReturn(TestUtils.getTeam());

		Boolean saved = teamUseCase.addTeam(TestUtils.getTeamDtoWithoutId());

		assertTrue(saved);

	}

	@Test
	void success_when_updateTeam() {
		when(teamRepository.findById(1L)).thenReturn(Optional.ofNullable(TestUtils.getTeam()));
		when(teamRepository.save(TestUtils.getTeam())).thenReturn(TestUtils.getTeam());

		Boolean saved = teamUseCase.updateTeam(TestUtils.getTeamDto());

		assertTrue(saved);

	}

	@Test
	void success_when_deleteTeam() {
		teamUseCase.deleteTeam(1L);

		verify(teamRepository,times(1)).deleteById(1L);

	}



}
