package in.ashokit.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime; // Import LocalDateTime

import lombok.Data;

@Entity
@Table(name = "ALT_STUDENT_ENQUIRY")
@Data
public class StudentEnquiryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer enqId;
  
    private String studentName;
    private Long studentPhno;
    private String classMode;
    private String courseName;
    private String statusName;
    @CreationTimestamp
    private LocalDateTime dateCreated; // Use LocalDateTime for timestamps
    
    @UpdateTimestamp
    private LocalDateTime lastUpdated; // Use LocalDateTime for timestamps

    @ManyToOne
    @JoinColumn(name = "userId")
    private UserDetailsEntity user; // Reference to the user


}
