package com.euronet.main.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.euronet.main.domain.MovieDetails;
import com.euronet.main.domain.RatingDetails;
@Repository
public class RatingDetailsRepository implements
		RatingDetailsrepositoryInterface {
	
	List<RatingDetails>allRatings = new ArrayList<>();
	
	
	private void allRatings(){
		allRatings.add(new RatingDetails(new MovieDetails(1,null,null), 4.5));
		allRatings.add(new RatingDetails(new MovieDetails(2,null,null), 4.7));
		allRatings.add(new RatingDetails(new MovieDetails(3,null,null), 4.9));

	}

	@Override
	public List<RatingDetails> getAllRatings() {
		allRatings();
		return allRatings;
	}

	@Override
	public RatingDetails getOneRatingByMovieId(int movieId) {
		allRatings();
		for (RatingDetails ratingDetails : allRatings) {
			if(ratingDetails.getMovieDetails().getMovieId() == movieId){
				return ratingDetails;
			}
		}
		return null;
	}

}
