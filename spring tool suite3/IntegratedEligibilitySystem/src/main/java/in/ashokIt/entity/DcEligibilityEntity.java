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
@Table(name = "ED_ELIG_DTLS")
@Data
public class DcEligibilityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ED_TRACE_ID")
    private Long edTraceId;

    @ManyToOne
    @JoinColumn(name = "CASE_NUM", referencedColumnName = "CASE_NUM")
    private  IESAppsEntity application;

    @Column(name = "PLAN_NAME")
    private String planName;

    @Column(name = "PLAN_STATUS")
    private String planStatus;

    @Temporal(TemporalType.DATE)
    @Column(name = "ELIG_START_DATE")
    private Date eligStartDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "ELIG_END_DATE")
    private Date eligEndDate;

    @Column(name = "BENEFIT_AMT")
    private Double benefitAmt;

    @Column(name = "DENIAL_REASON")
    private String denialReason;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    // Getters and Setters
}
