package com.aoji.controller;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:54 2017/11/10
 */

import com.aoji.model.BasePageModel;
import com.aoji.model.PageParam;
import com.aoji.model.StudentInfo;
import com.aoji.service.StudentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/student")
    public String list(){
        return "list";
    }

    @RequestMapping(value="index",method = RequestMethod.GET)
    @ResponseBody
    public BasePageModel get(StudentInfo studentInfo, PageParam pageParam, BasePageModel basePageModel){
        Page<?> page = PageHelper.startPage(pageParam.getiDisplayStart()/pageParam.getiDisplayLength()+1, pageParam.getiDisplayLength());
        String[] str=propList();
        studentService.getList(studentInfo);
        pageParam.setSortPro(str[pageParam.getiSortCol_0()]);
        basePageModel.setAaData(page);
        basePageModel.setiTotalDisplayRecords((int)page.getTotal());
        basePageModel.setiTotalRecords((int)page.getTotal());
        return basePageModel;
    }
    public String[] propList(){
        return new String[]{"id","name","systemNo","gender","address","mobile","qqNumber"};
    }
}
