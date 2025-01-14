package com.euronet.main.repository;

import java.util.List;

import com.euronet.main.doman.Catalog;

public interface CatalogRepositoryInterface {
	
	public List<Catalog> getAllCatalogList();

	public Catalog getOneCatalogByMovieId(int movieid);
	
}
