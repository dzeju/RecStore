package io.swagger.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.Recycling;

@Service
@Transactional
public class RecyclingServiceImpl implements RecyclingService {
	@Autowired
	private RecyclingRepository recyclingRepository;
	
	@Override
	public Recycling getRecycling() {
		Optional<Recycling> a = recyclingRepository.findById((long) 0);
		if(a.isPresent()) return a.get();
		else return null;
	}

	@Override
	public Recycling setRecycling(Recycling recycling) {
		return recyclingRepository.save(recycling);
	}

}
