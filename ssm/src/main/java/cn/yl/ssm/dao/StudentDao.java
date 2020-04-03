package cn.yl.ssm.dao;

import cn.yl.ssm.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface StudentDao {
    //添加
    @Insert("INSERT INTO student(name) values(#{name}) ")
    void add(String name);
    //删除
    @Delete("DELETE FROM student WHERE id=#{id}")
    void del(Long id);
    //修改
    @Update("UPDATE student SET name=#{name} WHERE id=#{id}")
    void upd(Student stu);
    //根据ID查询
    @Select("SELECT * FROM student WHERE id=#{id}")
    Student get(Long id);
    //查询所有
    @Select("SELECT * FROM student")
    List<Student> list();
}
