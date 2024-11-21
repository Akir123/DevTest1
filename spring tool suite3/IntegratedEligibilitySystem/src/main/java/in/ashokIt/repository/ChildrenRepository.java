package in.ashokIt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.DcChildrenEntity;

@Repository
public interface ChildrenRepository extends JpaRepository<DcChildrenEntity, Long> {
    // You can add custom query methods if needed
}
