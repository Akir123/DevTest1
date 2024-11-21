package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
@Entity
public class Product {
	@Id
	@GeneratedValue
private Integer pid;
	@NotBlank(message = "Name Is Mandatory !!!")
	@Size(min=3, max=15, message="Name should have 3 to 15 characters !!!")
private String name;
	@NotNull(message = "Price Is Mandatory !!!")
private Double price;
	@NotNull(message = "Quantity Is Mandatory !!!")
private Integer qty;
}
