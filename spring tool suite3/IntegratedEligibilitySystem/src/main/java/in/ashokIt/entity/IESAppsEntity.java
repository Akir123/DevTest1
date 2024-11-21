package in.ashokIt.entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "IES_APPS")
@Data
public class IESAppsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CASE_NUM")
    private Long caseNum;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHNO")
    private String phno;

    @Temporal(TemporalType.DATE)
    @Column(name = "DOB")
    private Date dob;

    @Column(name = "SSN")
    private String ssn;

    @Column(name = "STATE_NAME")
    private String stateName;

    @Column(name = "CITY_NAME")
    private String cityName;

    @Column(name = "HOUSE_NUM")
    private String houseNum;

    @ManyToOne
    @JoinColumn(name = "CREATED_BY", referencedColumnName = "USER_ID")
    private IESUserEntity createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    // Getters and Setters
}

