package in.ashokIt.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "CO_NOTICES")
@Data
public class CorrespondanceNoticesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NOTICE_ID")
    private Long noticeId;

    @ManyToOne
    @JoinColumn(name = "CASE_NUM", referencedColumnName = "CASE_NUM")
    private IESAppsEntity application;

    @ManyToOne
    @JoinColumn(name = "ED_TRACE_ID", referencedColumnName = "ED_TRACE_ID")
    private DcEligibilityEntity eligibilityDetails;

    @Lob
    @Column(name = "CO_PDF")
    private byte[] coPdf;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PRINT_DATE")
    private Date printDate;

    @Column(name = "NOTICE_STATUS", columnDefinition = "CHAR(1) DEFAULT 'P'")
    private char noticeStatus = 'P';

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;
}

