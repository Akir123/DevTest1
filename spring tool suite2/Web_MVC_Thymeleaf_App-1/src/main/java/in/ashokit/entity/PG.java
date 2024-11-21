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
public class PG {
	@Id
	@GeneratedValue
	private Integer cid;
	@NotBlank(message = "Name Is Mandatory !!!")
	@Size(min=3, max=15, message="Name should have 3 to 15 characters !!!")
private String name;
	@NotNull(message = "Payment Is Mandatory !!!")
private Double payment;
	@NotNull(message = "Mobile No. Is Mandatory !!!")
private Long mobNo;
}
