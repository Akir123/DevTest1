package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="ALT_ENQUIRY_STATUS")
@Data
public class EnquiryStatusEntity {
@Id
@GeneratedValue
public Integer statusId;
public String statusName;
}
