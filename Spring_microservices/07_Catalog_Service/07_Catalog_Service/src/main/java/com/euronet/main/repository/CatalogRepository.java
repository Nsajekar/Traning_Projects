package com.euronet.main.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.euronet.main.doman.Catalog;
import com.euronet.main.doman.MovieDetails;
import com.euronet.main.doman.RatingDetails;

@Repository
public class CatalogRepository implements CatalogRepositoryInterface {

	private List<Catalog> allCatalogs = new ArrayList<>();
	
	 private void allCatalogs(){
	 allCatalogs.add(new Catalog(new MovieDetails(1, null, null),new
	 RatingDetails(new MovieDetails(1, null, null), 0)));
	 allCatalogs.add(new Catalog(new MovieDetails(2, null, null),new
	 RatingDetails(new MovieDetails(3, null, null), 0)));
	 allCatalogs.add(new Catalog(new MovieDetails(3, null, null),new
	 RatingDetails(new MovieDetails(3, null, null), 0)));
	 }

	
	

	@Override
	public List<Catalog> getAllCatalogList() {
		allCatalogs();
		if (allCatalogs.isEmpty()) {
			allCatalogs.add(new Catalog(new MovieDetails(0,
					"First Add Elements", null), null));
		}
		return allCatalogs;
	}

	@Override
	public Catalog getOneCatalogByMovieId(int movieid) {
		allCatalogs();
		for (Catalog catalog : allCatalogs) {
			if (catalog.getMovieDetails().getMovieId() == movieid) {
				return catalog;
			}
		}
		return null;
	}

	

}
