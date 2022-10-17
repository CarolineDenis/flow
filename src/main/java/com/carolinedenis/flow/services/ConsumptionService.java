package com.carolinedenis.flow.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.carolinedenis.flow.models.Consumption;
import com.carolinedenis.flow.models.User;
import com.carolinedenis.flow.repositories.ConsumptionRepository;

@Service
public class ConsumptionService {

	private final ConsumptionRepository consumptionRepo;

	public ConsumptionService(ConsumptionRepository consumptionRepo) {
		this.consumptionRepo = consumptionRepo;
	}

	public List<Consumption> allConsumptions() {
		return consumptionRepo.findAll();
	}

	public Consumption findById(Long id) {
		Optional<Consumption> optionalConsumption = consumptionRepo.findById(id);
		if (optionalConsumption.isPresent()) {
			return optionalConsumption.get();
		} else {
			return null;
		}
	}

	public Consumption createConsumption(Consumption consumption) {
		return consumptionRepo.save(consumption);
	}

	public Consumption updateConsumption(Consumption consumption, Long id) {
		User user = consumption.getConsumer();
		Long userConsumptionId = user.getId();
		if (userConsumptionId != id) {
			return null;
		}
		return consumptionRepo.save(consumption);
	}

	public void deleteDay(Long id, Long UserInSession, Consumption consumption) {
		User user = consumption.getConsumer();
		Long userConsumptionId = user.getId();
		if (userConsumptionId == UserInSession && UserInSession != null) {
			consumptionRepo.deleteById(id);
		}
	}
	
}
