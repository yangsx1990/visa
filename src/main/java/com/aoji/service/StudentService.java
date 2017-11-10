package com.aoji.service;

import com.aoji.model.StudentInfo;

import java.util.List;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午11:14 2017/11/10
 */
public interface StudentService {

    /**
     * 查询学生列表
     * @param studentInfo
     * @return
     */
    List<StudentInfo> getList(StudentInfo studentInfo);
}
