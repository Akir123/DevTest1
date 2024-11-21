package in.ashokIt.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokIt.entity.BenefitInfo;
import in.ashokIt.repository.BenefitInfoRepository;

import java.util.List;

@Service
@Transactional
public class BiInfoService {

    @Autowired
    private BenefitInfoRepository biInfoRepository;

    public List<BenefitInfo> getAllBiInfos() {
        return biInfoRepository.findAll();
    }

    public BenefitInfo getBiInfoById(Long benefitId) {
        return biInfoRepository.findById(benefitId)
                               .orElseThrow(() -> new RuntimeException("BiInfo not found with id: " + benefitId));
    }

    public BenefitInfo saveOrUpdateBiInfo(BenefitInfo biInfo) {
        return biInfoRepository.save(biInfo);
    }

    public void deleteBiInfo(Long benefitId) {
        biInfoRepository.deleteById(benefitId);
    }
}

