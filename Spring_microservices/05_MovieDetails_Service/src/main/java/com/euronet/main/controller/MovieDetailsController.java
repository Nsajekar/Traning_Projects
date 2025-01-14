package com.euronet.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.euronet.main.domain.MovieDetails;
import com.euronet.main.service.MovieDetailsServiceInterface;

@RestController
@RequestMapping("moviedetailsapi")
public class MovieDetailsController {
	@Autowired
	private MovieDetailsServiceInterface movieDetailsServiceInterface;

	@RequestMapping(value = "moviedetails/all", method = RequestMethod.GET)
	public List<MovieDetails> getAllBookDetails() {
		return movieDetailsServiceInterface.getAllMovies();
	}

	@RequestMapping(value = "moviedetails/{movieId}", method = RequestMethod.GET)
	public MovieDetails getSingleBook(@PathVariable int movieId) {
		return movieDetailsServiceInterface.getMovieByMovieId(movieId);
	}
}
