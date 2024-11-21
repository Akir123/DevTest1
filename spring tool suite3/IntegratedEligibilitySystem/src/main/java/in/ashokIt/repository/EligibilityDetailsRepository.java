package in.ashokIt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.DcEligibilityEntity;

@Repository
public interface EligibilityDetailsRepository extends JpaRepository<DcEligibilityEntity, Long> {
    // You can add custom query methods if needed
}
