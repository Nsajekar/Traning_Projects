package com.euronet.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.euronet.main.domain.MovieDetails;
import com.euronet.main.domain.RatingDetails;
import com.euronet.main.service.RatingDetailsServiceInterface;

@RestController
@RequestMapping("ratingdetailsapi")
public class RatingDetailsController {

	@Autowired
	private RatingDetailsServiceInterface ratingDetailsServiceInterface;
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("ratingdetails/all")
	public List<RatingDetails> getAllRatings() {
		List<RatingDetails> allRatings = ratingDetailsServiceInterface
				.getAllRatings();

		for (RatingDetails ratingDetails : allRatings) {
			int movieId = ratingDetails.getMovieDetails().getMovieId();
			System.out.println(movieId);
			MovieDetails movieDetails = restTemplate.getForObject(
					"http://MovieDetails-service/moviedetailsapi/moviedetails/"
							+ movieId, MovieDetails.class);
			ratingDetails.setMovieDetails(movieDetails);

		}
		return allRatings;
	}

	@RequestMapping("ratingdetails/{movieId}")
	public RatingDetails getOneRating(@PathVariable int movieId) {
		RatingDetails ratingDetails = ratingDetailsServiceInterface
				.getOneRatingByMovieId(movieId);
		MovieDetails movieDetails = restTemplate
				.getForObject(
						"http://MovieDetails-service/moviedetailsapi/moviedetails/"
								+ movieId, MovieDetails.class);
		ratingDetails.setMovieDetails(movieDetails);
		return ratingDetails;
	}

}
