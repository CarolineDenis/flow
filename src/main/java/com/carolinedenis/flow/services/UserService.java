package com.carolinedenis.flow.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.carolinedenis.flow.models.Consumption;
import com.carolinedenis.flow.models.LoginUser;
import com.carolinedenis.flow.models.User;
import com.carolinedenis.flow.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepo;
    
    public UserService(UserRepository userRepo) {
    	this.userRepo = userRepo;
    }
    
    public User register(User newUser, BindingResult result) {
        Optional<User> optionalUser = userRepo.findByEmail(newUser.getEmail());
        if (optionalUser.isPresent()) {
        	result.rejectValue("email", "Matches", "An account with this email already exists");
        }
        if(!newUser.getPassword().equals(newUser.getConfirm())) {
        	result.rejectValue("email", "Matches", "The confirmation must match the password");
        }
        if(result.hasErrors()) {
        	return null;
        }
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(hashed);
    	return userRepo.save(newUser);
    }
    
    public User login(LoginUser newLogin, BindingResult result) {
        Optional<User> optionalUser = userRepo.findByEmail(newLogin.getEmail());
        if(!optionalUser.isPresent()) {
        	result.rejectValue("email", "Matches", "User not found");
        	return null;
        }
        User user = optionalUser.get();
        
    	if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
    	    result.rejectValue("password", "Matches", "Invalid Password!");
    	}    
    	if(result.hasErrors()) {
    		return null;
    	}
    	return user;
    	}
    
    public User findById(Long id) {
    	Optional<User> optionalUser = userRepo.findById(id);
    	if(optionalUser.isPresent()) {
    		return optionalUser.get();
    	}
    	return null;
    }

    public User createUser(User user) {
    	return userRepo.save(user);
    }
    
    public ArrayList<Integer> totalWater(Long id) {
    	Optional<User> optionalUser = userRepo.findById(id);
    	User user = optionalUser.get();
    	List<Consumption> consumptions = user.getUserConsumptions();
    	ArrayList<Integer> totalArray = new ArrayList<Integer>();
    	for (Consumption eachConsumption: consumptions) {
    		Integer total = 0;
    		if (eachConsumption.getShower() > 0) {
    			total += 76;
    		}
    		if (eachConsumption.getBath() > 0) {
    			total += 114;
    		}
    		if (eachConsumption.getToilet() > 0) {
    			total += 6;
    		}
    		if (eachConsumption.getHandWash() > 0) {
    			total += 15;
    		}
    		if (eachConsumption.getBrushTeeth() > 0) {
    			total += 15;
    		}
    		if (eachConsumption.getWashingMachine() > 0) {
    			total += 72;
    		}
    		if (eachConsumption.getDishwasher() > 0) {
    			total += 45;
    		}
    		if (eachConsumption.getDishesByHand() > 0) {
    			total += 76;
    		}
    		totalArray.add(total);
    	}
    	return totalArray; 
    	
    }
    
}