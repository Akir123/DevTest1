package in.ashokIt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokIt.entity.IESPlansEntity;
import in.ashokIt.service.PlanService;

import java.util.List;

@Component
public class ApplicationStartupRunner implements CommandLineRunner {

    @Autowired
    private PlanService planService;

    @Override
    public void run(String... args) throws Exception {
        // Example: Fetch and log all plans on application startup
        List<IESPlansEntity> plans = planService.getAllPlans();
        plans.forEach(plan -> {
            System.out.println("Plan ID: " + plan.getPlanId() + ", Name: " + plan.getPlanName());
        });
        
        // Additional initialization or startup tasks can be added here
    }
}

