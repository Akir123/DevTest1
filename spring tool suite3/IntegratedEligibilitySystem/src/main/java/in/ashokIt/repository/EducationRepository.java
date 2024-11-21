package in.ashokIt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.DcEducationEntity;

@Repository
public interface EducationRepository extends JpaRepository<DcEducationEntity, Long> {
    // You can add custom query methods if needed
}

