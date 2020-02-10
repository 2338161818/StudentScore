package com.controller;

import com.entity.Student2019;
import com.entity.Student2019Example;
import com.service.Student2019Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/")
public class Student2019Controller {
    @Autowired
    private Student2019Impl student2019;

    @RequestMapping("select")
    public String select( Student2019Example example, Model model) {
        List<Student2019> student2019List = student2019.selectByExample(example);
        model.addAttribute("Student",student2019List);
        return "select";
    }
}