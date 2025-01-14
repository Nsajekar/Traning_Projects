package com.euronet.main.repository;

import java.util.List;

import com.euronet.main.domain.MovieDetails;

public interface MovieDetailsRepositoryInterface {

	public List<MovieDetails> getAllMovies();
	
	public MovieDetails getMovieByMovieId(int movieId);
}
