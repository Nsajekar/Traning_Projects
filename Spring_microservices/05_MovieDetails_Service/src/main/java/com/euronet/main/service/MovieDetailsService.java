package com.euronet.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euronet.main.domain.MovieDetails;
import com.euronet.main.repository.MovieDetailsRepository;
import com.euronet.main.repository.MovieDetailsRepositoryInterface;

@Service
public class MovieDetailsService implements MovieDetailsServiceInterface {
	@Autowired
	private MovieDetailsRepositoryInterface movieDetailsRepositoryInterface;

	@Override
	public List<MovieDetails> getAllMovies() {
		return movieDetailsRepositoryInterface.getAllMovies();
	}

	@Override
	public MovieDetails getMovieByMovieId(int movieId) {
		return movieDetailsRepositoryInterface.getMovieByMovieId(movieId);
	}

}
