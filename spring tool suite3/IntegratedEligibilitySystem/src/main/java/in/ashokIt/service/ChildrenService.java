package in.ashokIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokIt.entity.DcChildrenEntity;
import in.ashokIt.repository.ChildrenRepository;

import java.util.List;

@Service
@Transactional
public class ChildrenService {

    @Autowired
    private ChildrenRepository childrenRepository;

    public List<DcChildrenEntity> getAllChildren() {
        return childrenRepository.findAll();
    }

    public DcChildrenEntity getChildById(Long childId) {
        return childrenRepository.findById(childId)
                                 .orElseThrow(() -> new RuntimeException("Child not found with id: " + childId));
    }

    public DcChildrenEntity saveOrUpdateChild(DcChildrenEntity child) {
        return childrenRepository.save(child);
    }

    public void deleteChild(Long childId) {
        childrenRepository.deleteById(childId);
    }
}
