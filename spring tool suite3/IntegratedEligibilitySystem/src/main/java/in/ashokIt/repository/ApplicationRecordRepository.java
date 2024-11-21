package in.ashokIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.IESAppsEntity;

@Repository
public interface ApplicationRecordRepository extends JpaRepository<IESAppsEntity, Long> {
    // You can add custom query methods if needed
}

