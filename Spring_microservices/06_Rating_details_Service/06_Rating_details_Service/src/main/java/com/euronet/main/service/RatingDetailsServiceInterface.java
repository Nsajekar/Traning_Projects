package com.euronet.main.service;

import java.util.List;

import com.euronet.main.domain.MovieDetails;
import com.euronet.main.domain.RatingDetails;

public interface RatingDetailsServiceInterface {

	public List<RatingDetails> getAllRatings();
	
	public RatingDetails getOneRatingByMovieId(int movieId);
		
	
}
