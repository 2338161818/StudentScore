package com.service;

import com.entity.Student2019;
import com.entity.Student2019Example;
import com.mapper.Student2019Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student2019Impl implements Student2019Service {
    @Autowired
    private Student2019Mapper student2019Mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Student2019 record) {
        return 0;
    }

    @Override
    public int insertSelective(Student2019 record) {
        return 0;
    }

    @Override
    public List<Student2019> selectByExample(Student2019Example example) {
        return student2019Mapper.selectByExample(example);
    }

    @Override
    public Student2019 selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Student2019 record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Student2019 record) {
        return 0;
    }
}
