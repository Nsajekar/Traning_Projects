package com.euronet.main.repository;

import java.util.List;

import com.euronet.main.domain.MovieDetails;
import com.euronet.main.domain.RatingDetails;

public interface RatingDetailsrepositoryInterface {
	public List<RatingDetails> getAllRatings();

	public RatingDetails getOneRatingByMovieId(int movieId);
}
