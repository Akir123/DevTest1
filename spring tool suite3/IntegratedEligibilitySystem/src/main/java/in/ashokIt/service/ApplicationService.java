package in.ashokIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import in.ashokIt.entity.IESAppsEntity;
import in.ashokIt.repository.ApplicationRecordRepository;
import java.util.List;

@Service
@Transactional
public class ApplicationService {

    @Autowired
    private ApplicationRecordRepository applicationRepository;

    public List<IESAppsEntity> getAllApplications() {
        return applicationRepository.findAll();
    }

    public IESAppsEntity getApplicationById(Long applicationId) {
        return applicationRepository.findById(applicationId)
                                    .orElseThrow(() -> new RuntimeException("Application not found with id: " + applicationId));
    }

    public IESAppsEntity saveOrUpdateApplication(IESAppsEntity application) {
        return applicationRepository.save(application);
    }

    public void deleteApplication(Long applicationId) {
        applicationRepository.deleteById(applicationId);
    }
}

