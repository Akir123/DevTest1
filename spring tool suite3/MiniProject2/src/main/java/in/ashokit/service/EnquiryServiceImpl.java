package in.ashokit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.DashboardResponse;
import in.ashokit.binding.EnquiryForm;
import in.ashokit.binding.EnquirySearchCriteria;
import in.ashokit.entity.CourseEntity;
import in.ashokit.entity.EnquiryStatusEntity;
import in.ashokit.entity.StudentEnquiryEntity;
import in.ashokit.entity.UserDetailsEntity;
import in.ashokit.repo.CourseRepo;
import in.ashokit.repo.EnquiryStatusRepo;
import in.ashokit.repo.StudentEnquiryRepo;
import in.ashokit.repo.UserDetailsRepo;
import jakarta.servlet.http.HttpSession;

@Service
public class EnquiryServiceImpl implements EnquiryService {

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private EnquiryStatusRepo statusRepo;

    @Autowired
    private StudentEnquiryRepo enqRepo;

    @Autowired
    private HttpSession session;

    @Override
    public DashboardResponse getDashboardData(Integer userId) {
        DashboardResponse response = new DashboardResponse();
        if (userId != null) {
            Optional<UserDetailsEntity> findById = userDetailsRepo.findById(userId);
            if (findById.isPresent()) {
                UserDetailsEntity userEntity = findById.get();
                List<StudentEnquiryEntity> enquiry = userEntity.getEnquiry();
                Integer totalCnt = enquiry.size();
                Integer enrolledCnt = enquiry.stream()
                                             .filter(e -> "Enrolled".equals(e.getStatusName()))
                                             .collect(Collectors.toList())
                                             .size();
                Integer lostCnt = enquiry.stream()
                                         .filter(e -> "Lost".equals(e.getStatusName()))
                                         .collect(Collectors.toList())
                                         .size();
                
                response.setTotalEnquiryCnt(totalCnt);
                response.setEnrolledCnt(enrolledCnt);
                response.setLostCnt(lostCnt);
            }
        }
        return response;
    }

    @Override
    public List<String> getCourses() {
        List<CourseEntity> findAll = courseRepo.findAll();
        List<String> names = new ArrayList<>();
        for(CourseEntity entity : findAll) {
            names.add(entity.getCourseName());
        }
        return names;
    }

    @Override
    public List<String> getEnquiryStatus() {
        List<EnquiryStatusEntity> statusEntities = statusRepo.findAll();
        List<String> statusList = new ArrayList<>();
        for (EnquiryStatusEntity entity : statusEntities) {
            statusList.add(entity.getStatusName());
        }
        return statusList;
    }

    @Override
    public boolean saveEnquiry(EnquiryForm form) {
        StudentEnquiryEntity enquiryEntity = new StudentEnquiryEntity();
        BeanUtils.copyProperties(form, enquiryEntity);     
        Integer userId = (Integer) session.getAttribute("userId");
        UserDetailsEntity userEntity = userDetailsRepo.findById(userId).get();
        enquiryEntity.setUser(userEntity);
        enqRepo.save(enquiryEntity);
        return true;
    }

    @Override
    public List<StudentEnquiryEntity> getEnquiry() {
        Integer userId = (Integer) session.getAttribute("userId");
        Optional<UserDetailsEntity> findById = userDetailsRepo.findById(userId);
        if(findById.isPresent()) {
            UserDetailsEntity userDetailsEntity = findById.get();
            List<StudentEnquiryEntity> viewEnquiry = userDetailsEntity.getEnquiry();
            return viewEnquiry;
        }
        return null;
    }

	@Override
	public List<StudentEnquiryEntity> getFilteredEnqs(EnquirySearchCriteria criteria, Integer userId) {
		// TODO Auto-generated method stub
        Optional<UserDetailsEntity> findById = userDetailsRepo.findById(userId);
        if(findById.isPresent()) {
            UserDetailsEntity userDetailsEntity = findById.get();
            List<StudentEnquiryEntity> viewEnquiry = userDetailsEntity.getEnquiry();
            //filter logic
            if(null != criteria.getCourseName() && !"".equals(criteria.getCourseName())) {
            	viewEnquiry = viewEnquiry.stream()
            	.filter(e -> e.getCourseName().equals(criteria.getCourseName()))
            	.collect(Collectors.toList());
            }
            if(null != criteria.getStatusName() && !"".equals(criteria.getStatusName())) {
            	viewEnquiry = viewEnquiry.stream()
            	.filter(e -> e.getStatusName().equals(criteria.getStatusName()))
                .collect(Collectors.toList());
        }
            if(null != criteria.getClassMode() && !"".equals(criteria.getClassMode())) {
            	viewEnquiry.stream()
            	.filter(e -> e.getClassMode().equals(criteria.getClassMode()))
                .collect(Collectors.toList());
        }

			return viewEnquiry;
                  
        }
        return null;
	}

}
