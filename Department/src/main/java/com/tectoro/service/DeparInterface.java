package com.tectoro.service;

import java.util.List;
import java.util.Optional;

import com.tectoro.model.Deparment;

public interface DeparInterface {
	public Deparment addDepartment(Deparment department);
	public Optional<Deparment> findbyId(int id);
	public List<Deparment> findall();
}
