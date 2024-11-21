package in.ashokIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokIt.entity.IESUserEntity;
import in.ashokIt.repository.UserRepository;


import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<IESUserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public IESUserEntity getUserById(Long userId) {
        return userRepository.findById(userId)
                              .orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
    }

    public IESUserEntity saveOrUpdateUser(IESUserEntity user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}

