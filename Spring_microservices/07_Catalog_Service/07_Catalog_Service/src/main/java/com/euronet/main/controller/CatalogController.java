package com.euronet.main.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.euronet.main.doman.Catalog;
import com.euronet.main.doman.MovieDetails;
import com.euronet.main.doman.RatingDetails;
import com.euronet.main.service.CatalogServiceInterface;

@RestController
@RequestMapping("catalogapi")
public class CatalogController {

	@Autowired
	private CatalogServiceInterface catalogServiceInterface;
	@Autowired
	private RestTemplate restTemplate;

	
	@RequestMapping("catalog/all")
	public List<Catalog> getAllCatalogs() {
		List<Catalog> allCatalogs = catalogServiceInterface.getAllCatalogList();
		for (Catalog catalog : allCatalogs) {
			int movieId = catalog.getMovieDetails().getMovieId();
			MovieDetails movieDetails = restTemplate.getForObject(
					"http://MovieDetails-service/moviedetailsapi/moviedetails/"
							+ movieId, MovieDetails.class);
			catalog.setMovieDetails(movieDetails);
			RatingDetails ratingDetails = restTemplate.getForObject(
					"http://RatingsDetails-service/ratingdetailsapi/ratingdetails/"
							+ movieId, RatingDetails.class);
			catalog.setRatingDetails(ratingDetails);
		}
		return allCatalogs;
	}
	
	@RequestMapping("catalog/{movieId}")
	public Catalog getOneCatalog(@PathVariable int movieId){
		Catalog catalog = catalogServiceInterface.getOneCatalogByMovieId(movieId);
		MovieDetails movieDetails = restTemplate
				.getForObject(
						"http://MovieDetails-service/moviedetailsapi/moviedetails/"
								+ movieId, MovieDetails.class);
		catalog.setMovieDetails(movieDetails);
		RatingDetails ratingDetails = restTemplate.getForObject(
				"http://RatingsDetails-service/ratingdetailsapi/ratingdetails/"
						+ movieId, RatingDetails.class);
		catalog.setRatingDetails(ratingDetails);
		return catalog;
	}
	
	
}
