package kodlamaio.northwind.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll();   //tüm ürünleri döndürür
	Result add(Product product);

}
