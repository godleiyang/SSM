package cn.yl.ssm.service;

import cn.yl.ssm.domain.Student;

import java.util.List;

public interface IStudentService {
    void add(String name);
    void del(Long id);
    void upd(Student stu);
    Student get(Long id);
    List<Student> list();
}
