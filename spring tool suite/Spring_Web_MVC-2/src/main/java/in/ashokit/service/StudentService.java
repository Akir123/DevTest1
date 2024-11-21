package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
public List<String> getCourses() {
	return Arrays.asList("java","python","aws","devops");
}
public List<String> getTimings() {
	return Arrays.asList("morning","evening","night");
}
}
