package com.spring.entity;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.JavaParam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface EmployeeRepositery extends JpaRepository <Employee, Serializable>
{

}
