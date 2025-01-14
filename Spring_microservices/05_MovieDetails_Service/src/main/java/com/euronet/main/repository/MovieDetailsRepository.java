package com.euronet.main.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.euronet.main.domain.MovieDetails;

@Repository
public class MovieDetailsRepository implements MovieDetailsRepositoryInterface{

	private List<MovieDetails> allMovies = new ArrayList<>();
	
	private void allMovies(){
		allMovies.add(new MovieDetails(1, "KGF Chapter 2", "Action"));
		allMovies.add(new MovieDetails(2, "PUSPA", "Thriller"));
		allMovies.add(new MovieDetails(3, "Spiderman-No Way Home", "Action"));
	}

	@Override
	public List<MovieDetails> getAllMovies() {
		allMovies();
		return allMovies;
	}

	@Override
	public MovieDetails getMovieByMovieId(int movieId) {
		allMovies();
		for (MovieDetails movieDetails : allMovies) {
			if(movieDetails.getMovieId() == movieId){
				return movieDetails;
			}
		}
		return null;
	}
      
	
	
}
