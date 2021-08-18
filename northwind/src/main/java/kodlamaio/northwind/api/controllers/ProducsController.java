package kodlamaio.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.entities.concretes.Product;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProducsController {
	
	private ProductService productService;
	
	@Autowired //productservice kim implemet(productmanager) ettiyse onu otomatik newleyip bize hazır hale getiriyor...
	public ProducsController(ProductService productService) {   //yani ProductManager productmanager=new Productmanager();
		super();
		this.productService = productService;
	}


	@GetMapping("/getall")// istekte bulunuyor
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
		
	}
	
	@PostMapping("/add")// istekte bulunuyor
	public Result add(@RequestBody Product product){
		return this.productService.add(product);		
	}

}
