package com.spring.repositery;

import com.spring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepositery extends JpaRepository<Student,Integer>
{
    public Student findByStudentAge(Integer age);
    public List<Student> findByStudentAgeGreaterThanEqual(Integer age);
    public List<Student> findByStudentNameAndStudentAge(String name,Integer age);

}
