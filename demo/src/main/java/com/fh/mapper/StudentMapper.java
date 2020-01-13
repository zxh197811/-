package com.fh.mapper;

import com.fh.model.Area;
import com.fh.model.Grade;
import com.fh.model.Student;
import com.fh.model.StudentQuery;

import java.util.List;

public interface StudentMapper {


    Long queryStudentCount(StudentQuery studentQuery);

    List<Student> queryStudentList(StudentQuery studentQuery);

    List<Area> queryAreaList();

    List<Grade> queryGradeList();


}
