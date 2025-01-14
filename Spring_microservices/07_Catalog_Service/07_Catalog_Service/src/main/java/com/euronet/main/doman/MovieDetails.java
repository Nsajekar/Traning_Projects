package com.euronet.main.doman;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MovieDetails {

	private int movieId;
	private String name;
	private String discription;
	
	public MovieDetails() {
		// TODO Auto-generated constructor stub
	}

	public MovieDetails(int movieId, String name, String discription) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.discription = discription;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	@Override
	public String toString() {
		return "MovieDetails [movieId=" + movieId + ", name=" + name
				+ ", discription=" + discription + "]";
	}
	
	
}
