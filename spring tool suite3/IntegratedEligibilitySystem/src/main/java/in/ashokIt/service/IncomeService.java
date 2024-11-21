package in.ashokIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokIt.entity.DcIncomeEntity;
import in.ashokIt.repository.IncomeRepository;

import java.util.List;

@Service
@Transactional
public class IncomeService {

    @Autowired
    private IncomeRepository incomeRepository;

    public List<DcIncomeEntity> getAllIncomes() {
        return incomeRepository.findAll();
    }

    public DcIncomeEntity getIncomeById(Long incomeId) {
        return incomeRepository.findById(incomeId)
                               .orElseThrow(() -> new RuntimeException("Income not found with id: " + incomeId));
    }

    public DcIncomeEntity saveOrUpdateIncome(DcIncomeEntity income) {
        return incomeRepository.save(income);
    }

    public void deleteIncome(Long incomeId) {
        incomeRepository.deleteById(incomeId);
    }
}

