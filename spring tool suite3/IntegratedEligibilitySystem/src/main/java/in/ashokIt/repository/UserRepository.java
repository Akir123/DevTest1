package in.ashokIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.IESUserEntity;

@Repository
public interface UserRepository extends JpaRepository<IESUserEntity, Long> {
    // You can add custom query methods if needed
}

