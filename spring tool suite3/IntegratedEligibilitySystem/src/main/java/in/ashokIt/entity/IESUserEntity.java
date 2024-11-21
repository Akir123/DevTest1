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
@Table(name = "IES_USER")
@Data
public class IESUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "USER_EMAIL")
    private String userEmail;

    @Column(name = "USER_PWD")
    private String userPwd;

    @Column(name = "USER_PHNO")
    private String userPhno;

    @Column(name = "USER_GENDER")
    private String userGender;

    @Column(name = "USER_DOB")
    private Date userDob;

    @Column(name = "USER_SSN")
    private String userSsn;

    @Column(name = "ACTIVE_SW", columnDefinition = "CHAR(1) DEFAULT 'Y'")
    private char activeSw = 'Y';

    @Column(name = "ACC_STATUS", columnDefinition = "CHAR(10) DEFAULT 'LOCKED'")
    private String accStatus = "LOCKED";

    @ManyToOne
    @JoinColumn(name = "ROLE_ID", insertable = false, updatable = false)
    private IESUserRolesEntity role;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    @ManyToOne
    @JoinColumn(name = "CREATED_BY", referencedColumnName = "USER_ID")
    private IESUserEntity createdBy;

    @ManyToOne
    @JoinColumn(name = "UPDATED_BY", referencedColumnName = "USER_ID")
    private IESUserEntity updatedBy;

}

