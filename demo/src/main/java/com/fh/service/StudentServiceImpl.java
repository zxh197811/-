package com.fh.service;


import com.fh.mapper.StudentMapper;
import com.fh.model.*;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public DataTableResult queryStudentList(StudentQuery studentQuery) {
        if (StringUtils.isNotBlank(studentQuery.getHobby())) {
            studentQuery.setHobbyList(Arrays.asList(studentQuery.getHobby().split(",")));
        }
        Long count = studentMapper.queryStudentCount(studentQuery);

        List<Student> studentList = studentMapper.queryStudentList(studentQuery);

        DataTableResult dataTableResult = new DataTableResult(studentQuery.getDraw(), count, count, studentList);

        return dataTableResult;
    }

    @Override
    public List<Grade> queryGradeList() {
        return studentMapper.queryGradeList();
    }

    @Override
    public List<Area> queryAreaList() {
        return studentMapper.queryAreaList();
    }
}
