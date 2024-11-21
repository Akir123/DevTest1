package in.ashokIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.BenefitInfo;

@Repository
public interface BenefitInfoRepository extends JpaRepository<BenefitInfo, Long> {
    // You can add custom query methods if needed
}
