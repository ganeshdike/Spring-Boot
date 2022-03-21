package com.spring.repositery;

import com.spring.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositery extends CrudRepository<Student,Integer>
{

}
