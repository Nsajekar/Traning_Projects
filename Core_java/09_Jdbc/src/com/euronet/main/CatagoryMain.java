package com.euronet.main;

import com.euronet.main.domain.Catagory;
import com.euronet.main.repository.CatagoryRepository;
import com.euronet.main.repository.CatagoryRepositoryInterface;

public class CatagoryMain {

	public static void main(String[] args) {
   
     CatagoryRepositoryInterface catagoryRepositoryInterface=new CatagoryRepository();
//     Catagory catagory =new Catagory(0, "Home decor");
//     catagoryRepositoryInterface.addNewCatagory(catagory);
//     for (Catagory catagories : catagoryRepositoryInterface.getAllCatagories()) {
//		System.out.println(catagories);
//	}
//     Catagory catagory =new Catagory(4, "Medical");
//     catagoryRepositoryInterface.updateCatagoryByCatagoryId(catagory);
//     Catagory catagory =new Catagory();
//     boolean result = catagoryRepositoryInterface.deleteCatagoryByCatagoryId(6);
//     if(result){
//    	 System.out.println("Deleted succesfully");
//     }else{
//    	 System.out.println("Failed");
//     }
     Catagory catagory = catagoryRepositoryInterface.getCatagoryByCatagoryId(2);
     System.out.println(catagory);
	}

}
