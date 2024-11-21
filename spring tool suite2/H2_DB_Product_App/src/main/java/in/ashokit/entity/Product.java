package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class Product {
	@Id
	@GeneratedValue
private Integer pid;
private String name;
private Double price;
private Integer qty;


public Product() {
	super();
}
public Product(Integer pid, String name, Double price, Integer qty) {
	super();
	this.pid = pid;
	this.name = name;
	this.price = price;
	this.qty = qty;
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Integer getQty() {
	return qty;
}
public void setQty(Integer qty) {
	this.qty = qty;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
}


}
