package in.ashokIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.IESUserRolesEntity;

@Repository
public interface RoleRepository extends JpaRepository<IESUserRolesEntity, Long> {
    // You can add custom query methods if needed
}

