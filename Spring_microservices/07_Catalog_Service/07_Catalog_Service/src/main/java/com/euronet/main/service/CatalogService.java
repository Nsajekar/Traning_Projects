package com.euronet.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euronet.main.doman.Catalog;
import com.euronet.main.repository.CatalogRepositoryInterface;
@Service
public class CatalogService implements CatalogServiceInterface {
	@Autowired
	private CatalogRepositoryInterface  catalogRepositoryInterface;

	@Override
	public List<Catalog> getAllCatalogList() {
		return catalogRepositoryInterface.getAllCatalogList();
	}

	@Override
	public Catalog getOneCatalogByMovieId(int movieid) {
		return catalogRepositoryInterface.getOneCatalogByMovieId(movieid);
	}

}
