package com.dxc.dao;

import org.springframework.data.repository.CrudRepository;

import com.dxc.beans.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
