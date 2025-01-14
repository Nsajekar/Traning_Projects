package com.euronet.main.service;

import java.util.List;
import com.euronet.main.domain.MovieDetails;

public interface MovieDetailsServiceInterface {

	public List<MovieDetails> getAllMovies();
	
	public MovieDetails getMovieByMovieId(int movieId);
	
}
