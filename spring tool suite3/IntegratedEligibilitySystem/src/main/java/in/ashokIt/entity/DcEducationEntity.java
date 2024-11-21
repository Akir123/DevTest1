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
@Table(name = "DC_EDUCATION")
@Data
public class DcEducationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EDUCATION_ID")
    private Long educationId;

    @Column(name = "HIGHEST_DEGREE")
    private String highestDegree;

    @Column(name = "GRADUATION_YEAR")
    private int graduationYear;

    @Column(name = "UNIVERSITY")
    private String university;

    @ManyToOne
    @JoinColumn(name = "CASE_NUM", referencedColumnName = "CASE_NUM")
    private IESAppsEntity application;

    // Getters and Setters
}
