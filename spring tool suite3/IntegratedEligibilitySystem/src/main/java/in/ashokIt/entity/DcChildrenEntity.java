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
@Table(name = "DC_CHILDREN")
@Data
public class DcChildrenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHILD_ID")
    private Long childId;

    @Column(name = "CHILD_NAME")
    private String childName;

    @Temporal(TemporalType.DATE)
    @Column(name = "CHILD_DOB")
    private Date childDob;

    @Column(name = "CHILD_SSN")
    private String childSsn;

    @ManyToOne
    @JoinColumn(name = "CASE_NUM", referencedColumnName = "CASE_NUM")
    private IESAppsEntity application;

    // Getters and Setters
}

