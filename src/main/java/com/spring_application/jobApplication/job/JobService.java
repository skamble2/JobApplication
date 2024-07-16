package com.spring_application.jobApplication.job;

import java.util.List;

public interface JobService {
    Job getJobById(Long id);
    List<Job> findAll();
    void createJob(Job job);
    boolean deleteJobById(Long id);
    boolean updateJob(Long id, Job updatedJob);
}
