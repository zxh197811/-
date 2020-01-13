package com.fh.service;

import com.fh.model.*;

import java.util.List;

public interface StudentService {

    DataTableResult queryStudentList(StudentQuery studentQuery);

    List<Grade> queryGradeList();

    List<Area> queryAreaList();

}
