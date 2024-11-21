package in.ashokIt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.DCPlanSelectionEntity;

@Repository
public interface PlanSelectionRepository extends JpaRepository<DCPlanSelectionEntity, Long> {
    // You can add custom query methods if needed
}