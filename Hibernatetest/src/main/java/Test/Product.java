package Test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author lenovo
 *
 */

@Entity
@Table(name="product_Annotation")
public class Product {
	@Id
	
	@Column(name="Product_id")
	int product_Id;
	
	
	@Column(name="product_nm")
	String product_Name;
	
	@Column(name="product_rs")
	String product_Price;
	
	
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int product_Id, String product_Name, String product_Price) {
		super();
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.product_Price = product_Price;
	}
	
	@Override
	public String toString() {
		return "\n Product [product_Id=" + product_Id + ", product_Name=" + product_Name + ", product_Price="
				+ product_Price + "]";
	}
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getProduct_Price() {
		return product_Price;
	}
	public void setProduct_Price(String product_Price) {
		this.product_Price = product_Price;
	}
	

}
