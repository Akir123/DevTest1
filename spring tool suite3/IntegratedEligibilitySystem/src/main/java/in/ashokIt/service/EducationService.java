package in.ashokIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokIt.entity.DcEducationEntity;
import in.ashokIt.repository.EducationRepository;

import java.util.List;

@Service
@Transactional
public class EducationService {

    @Autowired
    private EducationRepository educationRepository;

    public List<DcEducationEntity> getAllEducations() {
        return educationRepository.findAll();
    }

    public DcEducationEntity getEducationById(Long educationId) {
        return educationRepository.findById(educationId)
                                  .orElseThrow(() -> new RuntimeException("Education not found with id: " + educationId));
    }

    public DcEducationEntity saveOrUpdateEducation(DcEducationEntity education) {
        return educationRepository.save(education);
    }

    public void deleteEducation(Long educationId) {
        educationRepository.deleteById(educationId);
    }
}

