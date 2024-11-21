package in.ashokIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.IESPlansEntity;

@Repository
public interface PlanRepository extends JpaRepository<IESPlansEntity, Long> {
    // You can add custom query methods if needed
}
