package in.ashokIt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "DC_INCOME")
@Data
public class DcIncomeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INCOME_ID")
    private Long incomeId;

    @Column(name = "SALARY_INCOME")
    private Double salaryIncome;

    @Column(name = "RENT_INCOME")
    private Double rentIncome;

    @Column(name = "PROPERTY_INCOME")
    private Double propertyIncome;

    @ManyToOne
    @JoinColumn(name = "CASE_NUM", referencedColumnName = "CASE_NUM")
    private IESAppsEntity application;

    // Getters and Setters
}

