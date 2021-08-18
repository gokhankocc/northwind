package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="products") // veri tabanındaki karşılıgı
@Data
@AllArgsConstructor //parametrli constructor
@NoArgsConstructor  //parametresiz constructor
public class Product {
	@Id                //toblonun ıdsi sorgular bu ıd ye göre yapılır 
	@GeneratedValue(strategy = GenerationType.IDENTITY)       //ıd nin nasıl üreltildiğini söyler...
	@Column(name="product_id")  //veri tabanında hangi kolona karsılık geliyor 
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	String productName;
	
	@Column(name="unit_price")
	double unitPrice;
	
	@Column(name="units_in_stock")
	short unitsınStock;
	
	@Column(name="quantity_per_unit")
	String quantityPerUnit;
	
	
}
