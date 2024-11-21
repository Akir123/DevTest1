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
@Table(name = "IES_PLANS")
@Data
public class IESPlansEntity {

	private String formattedCreateDate; // Add this field

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAN_ID")
    private Long planId;

    @Column(name = "PLAN_NAME")
    private String planName;

    @Temporal(TemporalType.DATE)
    @Column(name = "PLAN_START_DATE")
    private Date planStartDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "PLAN_END_DATE")
    private Date planEndDate;

    @Column(name = "PLAN_CATEGORY")
    private String planCategory;

    @Column(name = "ACTIVE_SW", columnDefinition = "CHAR(1) DEFAULT 'Y'")
    private char activeSw = 'Y';

    @ManyToOne
    @JoinColumn(name = "CREATED_BY", referencedColumnName = "USER_ID")
    private IESUserEntity createdBy;

    @ManyToOne
    @JoinColumn(name = "UPDATED_BY", referencedColumnName = "USER_ID")
    private IESUserEntity updatedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date setFormattedCreateDate;
    
    public String getFormattedCreateDate() {
        return formattedCreateDate;
    }

    public void setFormattedCreateDate(String formattedCreateDate) {
        this.formattedCreateDate = formattedCreateDate;
    }
}


