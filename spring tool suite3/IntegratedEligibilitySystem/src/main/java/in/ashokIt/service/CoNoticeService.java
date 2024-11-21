package in.ashokIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokIt.entity.CorrespondanceNoticesEntity;
import in.ashokIt.repository.NoticeRepository;

import java.util.List;

@Service
@Transactional
public class CoNoticeService {

    @Autowired
    private NoticeRepository coNoticeRepository;

    public List<CorrespondanceNoticesEntity> getAllCoNotices() {
        return coNoticeRepository.findAll();
    }

    public CorrespondanceNoticesEntity getCoNoticeById(Long noticeId) {
        return coNoticeRepository.findById(noticeId)
                                  .orElseThrow(() -> new RuntimeException("CoNotice not found with id: " + noticeId));
    }

    public CorrespondanceNoticesEntity saveOrUpdateCoNotice(CorrespondanceNoticesEntity coNotice) {
        return coNoticeRepository.save(coNotice);
    }

    public void deleteCoNotice(Long noticeId) {
        coNoticeRepository.deleteById(noticeId);
    }
}

