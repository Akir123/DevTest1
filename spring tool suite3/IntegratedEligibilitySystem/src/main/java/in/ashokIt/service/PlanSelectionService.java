package in.ashokIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokIt.entity.DCPlanSelectionEntity;
import in.ashokIt.repository.PlanSelectionRepository;

import java.util.List;

@Service
@Transactional
public class PlanSelectionService {

    @Autowired
    private PlanSelectionRepository planSelectionRepository;

    public List<DCPlanSelectionEntity> getAllPlanSelections() {
        return planSelectionRepository.findAll();
    }

    public DCPlanSelectionEntity getPlanSelectionById(Long planSelectionId) {
        return planSelectionRepository.findById(planSelectionId)
                                       .orElseThrow(() -> new RuntimeException("PlanSelection not found with id: " + planSelectionId));
    }

    public DCPlanSelectionEntity saveOrUpdatePlanSelection(DCPlanSelectionEntity planSelection) {
        return planSelectionRepository.save(planSelection);
    }

    public void deletePlanSelection(Long planSelectionId) {
        planSelectionRepository.deleteById(planSelectionId);
    }
}

