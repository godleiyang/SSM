package cn.yl.ssm.service;

import cn.yl.ssm.dao.StudentDao;
import cn.yl.ssm.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentDao dao;
    @Override
    public void add(String name) {
        dao.add(name);
    }

    @Override
    public void del(Long id) {
        dao.del(id);
    }

    @Override
    public void upd(Student stu) {
        dao.upd(stu);
    }

    @Override
    public Student get(Long id) {
        return dao.get(id);
    }

    @Override
    public List<Student> list() {
        return dao.list();
    }
}
