package com.springcloud.repository;

import com.springcloud.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
