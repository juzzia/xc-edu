package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.ext.CourseInfo;
import com.xuecheng.framework.domain.course.request.CourseListRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator.
 */
@Mapper
public interface CourseMapper {


   List<CourseInfo> selectList(CourseListRequest courseListRequest);

   Long totalCount(CourseListRequest courseListRequest);
}
