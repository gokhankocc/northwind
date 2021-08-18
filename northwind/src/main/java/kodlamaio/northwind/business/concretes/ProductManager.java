package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.SuccessDataResult;
import kodlamaio.northwind.core.utilities.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service // bu class service görevi görecek demek
public class ProductManager implements ProductService{
	
	private ProductDao productDao;

	@Autowired //projeyi tarıyor productDaoya karsılık gelen sınıfı buluyor
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi");
				   //findAll bütün datayı getirir
	}

	@Override
	public Result add(Product product) {
		// TODO Auto-generated method stub
		this.productDao.save(product);
		return new SuccessResult("ürün eklendi");
	}

	/*@Override
	public Result add(Product product) {
		// TODO Auto-generated method stub
		this.productDao.save(product);
		return new SuccessResult("ürün eklendi");
	}*/
	/*@Override
    public Result add(Product product) {
        // TODO Auto-generated method stub
        this.productDao.save(product);
        return SuccessResult("Ürün eklendi");
    }
    private Result SuccessResult(String string) {
        // TODO Auto-generated method stub
        return SuccessResult("Ürün eklendi");
    }*/
	

	

	

}
