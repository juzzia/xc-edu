package com.xuecheng.learning.dao;


import com.xuecheng.framework.domain.learning.XcLearningCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearningCourseRepository extends JpaRepository<XcLearningCourse,String> {

    XcLearningCourse findByUserIdAndCourseId(String userId,String courseId);
}
