package com.carolinedenis.flow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.carolinedenis.flow.models.Consumption;

public interface ConsumptionRepository extends CrudRepository<Consumption, Long>{

List<Consumption> findAll();
}
