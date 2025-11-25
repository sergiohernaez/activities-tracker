package com.sergiohernaez.activitiesTracker;

import com.sergiohernaez.activitiesTracker.service.PostService;
import com.sergiohernaez.activitiesTracker.infrastructure.mapper.PostMapper;
import com.sergiohernaez.activitiesTracker.infrastructure.repository.PostRepository;
import com.sergiohernaez.activitiesTracker.controller.dto.PostDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PostServiceTest {

	@Mock
	PostRepository postRepository;

	@Mock
	PostMapper postMapper;

	@InjectMocks
	PostService postService;

	@Test
	void success_when_getPosts() {
		when(postRepository.findAll()).thenReturn(List.of(TestUtils.getPost()));
		when(postMapper.sourceToDestination(TestUtils.getPost())).thenReturn(TestUtils.getPostDTO());

		List<PostDTO> teams = postService.getPosts();

		assertEquals(teams.get(0).getId(),TestUtils.getPost().getId());

	}

	@Test
	void success_when_addPost() {
		when(postRepository.save(TestUtils.getPostWithoutId())).thenReturn(TestUtils.getPost());
		when(postMapper.destinationToSource(TestUtils.getPostDTOWithoutId())).thenReturn(TestUtils.getPostWithoutId());

		Boolean saved = postService.addPost(TestUtils.getPostDTOWithoutId());

		assertTrue(saved);

	}

	@Test
	void success_when_updatePost() {
		when(postRepository.findById(1L)).thenReturn(Optional.ofNullable(TestUtils.getPost()));
		when(postRepository.save(TestUtils.getPost())).thenReturn(TestUtils.getPost());
		when(postMapper.destinationToSource(TestUtils.getPostDTO())).thenReturn(TestUtils.getPost());

		Boolean saved = postService.updatePost(TestUtils.getPostDTO());

		assertTrue(saved);

	}

	@Test
	void success_when_deletePost() {
		postService.deletePost(1L);

		verify(postRepository,times(1)).deleteById(1L);

	}



}
