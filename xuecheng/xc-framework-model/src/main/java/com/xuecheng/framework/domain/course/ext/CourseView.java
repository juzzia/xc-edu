package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.CourseBase;
import com.xuecheng.framework.domain.course.CourseMarket;
import com.xuecheng.framework.domain.course.CoursePic;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
public class CourseView implements Serializable {

    private CourseBase courseBase; //课程基本信息
    private CourseMarket courseMarket;
    private CoursePic coursePic; //课程图片
    private TeachplanNode TeachplanNode;
}
