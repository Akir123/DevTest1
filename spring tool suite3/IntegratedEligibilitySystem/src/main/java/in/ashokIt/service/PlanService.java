package in.ashokIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokIt.entity.IESPlansEntity;
import in.ashokIt.repository.PlanRepository;
import in.ashokIt.utility.ApplicationUtils;

import java.util.List;

@Service
@Transactional
public class PlanService {

    @Autowired
    private PlanRepository planRepository;

    public List<IESPlansEntity> getAllPlans() {
        List<IESPlansEntity> plans = planRepository.findAll();
        plans.forEach(plan -> {
            String formattedCreateDate = ApplicationUtils.formatLocalDateTimeFromDate(plan.getCreatedDate());
            plan.setFormattedCreateDate(formattedCreateDate); // Assuming Plan entity has this field
        });
        return plans;
    }

    // Other methods omitted for brevity
}
