package in.ashokIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokIt.entity.DcEligibilityEntity;
import in.ashokIt.repository.EligibilityDetailsRepository;

import java.util.List;

@Service
@Transactional
public class EligibilityDetailsService {

    @Autowired
    private EligibilityDetailsRepository eligibilityDetailsRepository;

    public List<DcEligibilityEntity> getAllEligibilityDetails() {
        return eligibilityDetailsRepository.findAll();
    }

    public DcEligibilityEntity getEligibilityDetailsById(Long eligibilityDetailsId) {
        return eligibilityDetailsRepository.findById(eligibilityDetailsId)
                                           .orElseThrow(() -> new RuntimeException("EligibilityDetails not found with id: " + eligibilityDetailsId));
    }

    public DcEligibilityEntity saveOrUpdateEligibilityDetails(DcEligibilityEntity eligibilityDetails) {
        return eligibilityDetailsRepository.save(eligibilityDetails);
    }

    public void deleteEligibilityDetails(Long eligibilityDetailsId) {
        eligibilityDetailsRepository.deleteById(eligibilityDetailsId);
    }
}
