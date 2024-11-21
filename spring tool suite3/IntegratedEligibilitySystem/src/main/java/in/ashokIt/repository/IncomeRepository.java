package in.ashokIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.DcIncomeEntity;

@Repository
public interface IncomeRepository extends JpaRepository<DcIncomeEntity, Long> {
    // You can add custom query methods if needed
}
