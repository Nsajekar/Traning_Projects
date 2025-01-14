package com.euronet.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.euronet.main.domain.MovieDetails;
import com.euronet.main.repository.MovieDetailsRepositoryInterface;
import com.euronet.main.service.MovieDetailsService;
import com.euronet.main.service.MovieDetailsServiceInterface;

@SpringBootApplication
@EnableEurekaClient
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("MovieDetails Starts Running........");
//		MovieDetailsServiceInterface movieDetailsServiceInterface = new MovieDetailsService();
//		List<MovieDetails>allMovies=movieDetailsServiceInterface.getAllMovies();
//		System.out.println(allMovies);
//		System.out.println(movieDetailsServiceInterface.getMovieByMovieId(1));
	}

}
