package com.euronet.main.doman;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RatingDetails {

	private MovieDetails movieDetails;
	private double rating;
public RatingDetails() {
}
public RatingDetails(MovieDetails movieDetails, double rating) {
	super();
	this.movieDetails = movieDetails;
	this.rating = rating;
}
public MovieDetails getMovieDetails() {
	return movieDetails;
}
public void setMovieDetails(MovieDetails movieDetails) {
	this.movieDetails = movieDetails;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
@Override
public String toString() {
	return "RatingDetails [movieDetails=" + movieDetails + ", rating=" + rating
			+ "]";
}

}
