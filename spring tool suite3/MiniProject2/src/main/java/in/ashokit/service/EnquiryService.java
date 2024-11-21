package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;
import in.ashokit.binding.DashboardResponse;
import in.ashokit.binding.EnquiryForm;
import in.ashokit.binding.EnquirySearchCriteria;
import in.ashokit.entity.StudentEnquiryEntity;


@Service
public interface EnquiryService {
public DashboardResponse getDashboardData(Integer userId);
public List<String> getCourses();
public List<String> getEnquiryStatus();
public boolean saveEnquiry(EnquiryForm form);
public List<StudentEnquiryEntity> getEnquiry();
public List<StudentEnquiryEntity> getFilteredEnqs(EnquirySearchCriteria criteria, Integer userId);
}
