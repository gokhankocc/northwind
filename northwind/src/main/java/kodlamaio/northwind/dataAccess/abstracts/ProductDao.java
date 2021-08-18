package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{//hangi tabloya hangi ıd veri tipiyle sorguların hazırlanmasını 
	                                                                  //söylemiş oluruz                                                                   

	
}
