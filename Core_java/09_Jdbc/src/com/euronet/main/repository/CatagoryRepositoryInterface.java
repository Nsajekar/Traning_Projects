package com.euronet.main.repository;

import java.util.List;

import com.euronet.main.domain.Catagory;

public interface CatagoryRepositoryInterface {
	Catagory addNewCatagory(Catagory catagory);

	Catagory updateCatagoryByCatagoryId(Catagory catagory);

	Catagory getCatagoryByCatagoryId(int catagoryId);

	boolean deleteCatagoryByCatagoryId(int catagoryId);

	List<Catagory> getAllCatagories();

}
