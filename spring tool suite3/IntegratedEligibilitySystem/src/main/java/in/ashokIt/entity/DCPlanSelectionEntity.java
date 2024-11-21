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
@Table(name = "DC_PLAN_SELECTION")
@Data
public class DCPlanSelectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAN_SELECTION_ID")
    private Long planSelectionId;

    @ManyToOne
    @JoinColumn(name = "CASE_NUM", referencedColumnName = "CASE_NUM")
    private IESAppsEntity application;

    @ManyToOne
    @JoinColumn(name = "PLAN_ID", referencedColumnName = "PLAN_ID")
    private IESPlansEntity plan;

    // Getters and Setters
}

