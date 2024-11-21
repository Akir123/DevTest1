package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ProductEntity {
	@Id
private Integer id;
private String name;
private Integer age;
}
