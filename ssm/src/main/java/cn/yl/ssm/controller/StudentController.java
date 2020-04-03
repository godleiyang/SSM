package cn.yl.ssm.controller;

import cn.yl.ssm.domain.Student;
import cn.yl.ssm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService service;
    //添加
    @RequestMapping("/add")
    public String add(String name){
        service.add(name);
        return "添加成功";
    }
    //删除
    @RequestMapping("/del")
    public String del(Long id){
        service.del(id);
        return "删除成功";
    }
    //修改
    @RequestMapping("/upd")
    public String upd(){
        Student stu= new Student();
        stu.setId(1l);
        stu.setName("二狗");
        service.upd(stu);
        return "修改成功";
    }
    //根据ID查询
    @RequestMapping("/get")
    public Student get(Long id){
        Student stu = service.get(id);
        return stu;
    }
    //查询所有
    @RequestMapping("/list")
    public List<Student> list(){
        List<Student> list = service.list();
        return list;
    }
}
