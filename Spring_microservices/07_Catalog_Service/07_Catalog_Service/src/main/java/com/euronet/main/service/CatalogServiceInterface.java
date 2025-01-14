package com.euronet.main.service;

import java.util.List;

import com.euronet.main.doman.Catalog;

public interface CatalogServiceInterface {
 
	public List<Catalog>getAllCatalogList();
	
	public Catalog getOneCatalogByMovieId(int movieid);
}
