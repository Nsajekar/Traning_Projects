package com.euronet.main.doman;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Catalog {

	private MovieDetails movieDetails;
	private RatingDetails ratingDetails;
	
	public Catalog() {
		// TODO Auto-generated constructor stub
	}

	public Catalog(MovieDetails movieDetails, RatingDetails ratingDetails) {
		super();
		this.movieDetails = movieDetails;
		this.ratingDetails = ratingDetails;
	}

	public MovieDetails getMovieDetails() {
		return movieDetails;
	}

	public void setMovieDetails(MovieDetails movieDetails) {
		this.movieDetails = movieDetails;
	}

	public RatingDetails getRatingDetails() {
		return ratingDetails;
	}

	public void setRatingDetails(RatingDetails ratingDetails) {
		this.ratingDetails = ratingDetails;
	}

	@Override
	public String toString() {
		return "Catalog [movieDetails=" + movieDetails + ", ratingDetails="
				+ ratingDetails + "]";
	}
	
}
