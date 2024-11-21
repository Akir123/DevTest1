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
@Table(name = "BI_INFO")
@Data
public class BenefitInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BENEFIT_ID")
    private Long benefitId;

    @ManyToOne
    @JoinColumn(name = "CASE_NUM", referencedColumnName = "CASE_NUM")
    private IESAppsEntity application;

    @Column(name = "BENEFIT_MONTH_YEAR")
    private String benefitMonthYear;

    @Column(name = "BENEFIT_AMT")
    private Double benefitAmt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TRANSACTION_DATE")
    private Date transactionDate;

    @Column(name = "TRANSACTION_STATUS")
    private String transactionStatus;

    // Getters and Setters
}

