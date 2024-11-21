package in.ashokIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokIt.entity.IESUserRolesEntity;
import in.ashokIt.repository.RoleRepository;

import java.util.List;

@Service
@Transactional
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<IESUserRolesEntity> getAllRoles() {
        return roleRepository.findAll();
    }

    public IESUserRolesEntity getRoleById(Long roleId) {
        return roleRepository.findById(roleId)
                              .orElseThrow(() -> new RuntimeException("Role not found with id: " + roleId));
    }

    public IESUserRolesEntity saveOrUpdateRole(IESUserRolesEntity role) {
        return roleRepository.save(role);
    }

    public void deleteRole(Long roleId) {
        roleRepository.deleteById(roleId);
    }
}

