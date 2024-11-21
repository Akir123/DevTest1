package in.ashokIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.CorrespondanceNoticesEntity;

@Repository
public interface NoticeRepository extends JpaRepository<CorrespondanceNoticesEntity, Long> {
    // You can add custom query methods if needed
}

