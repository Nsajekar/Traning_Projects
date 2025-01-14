package com.euronet.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euronet.main.domain.MovieDetails;
import com.euronet.main.domain.RatingDetails;
import com.euronet.main.repository.RatingDetailsrepositoryInterface;
@Service 
public class RatingDetailsService implements RatingDetailsServiceInterface {
	
	@Autowired 
	private RatingDetailsrepositoryInterface ratingDetailsrepositoryInterface;

	@Override
	public List<RatingDetails> getAllRatings() {
		return ratingDetailsrepositoryInterface.getAllRatings();
	}

	@Override
	public RatingDetails getOneRatingByMovieId( int movieId) {
		return ratingDetailsrepositoryInterface.getOneRatingByMovieId(movieId);
	}

}
