package com.tectoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.model.Deparment;

@Repository
public interface DepartmentRepo extends JpaRepository<Deparment, Integer>{

}
