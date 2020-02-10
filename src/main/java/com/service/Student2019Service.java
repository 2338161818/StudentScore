package com.service;

import com.entity.Student2019;
import com.entity.Student2019Example;

import java.util.List;

public interface Student2019Service {
    int deleteByPrimaryKey(Integer id);

    int insert(Student2019 record);

    int insertSelective(Student2019 record);

    List<Student2019> selectByExample(Student2019Example example);

    Student2019 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student2019 record);

    int updateByPrimaryKey(Student2019 record);
}
