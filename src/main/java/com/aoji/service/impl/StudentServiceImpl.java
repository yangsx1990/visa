package com.aoji.service.impl;

import com.aoji.mapper.StudentInfoMapper;
import com.aoji.model.StudentInfo;
import com.aoji.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午11:15 2017/11/10
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentInfoMapper studentInfoMapper;

    @Override
    public List<StudentInfo> getList(StudentInfo studentInfo) {
        return studentInfoMapper.select(studentInfo);
    }
}
