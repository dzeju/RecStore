package io.swagger.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.About;

@Service
@Transactional
public class AboutServiceImpl implements AboutService {
	@Autowired
	private AboutRepository aboutRepository;
	
	@Override
	public About getAbout() {
		Optional<About> a = aboutRepository.findById((long) 0);
		if(a.isPresent()) return a.get();
		else return null;
	}

	@Override
	public About setAbout(About about) {
		return aboutRepository.save(about);
	}

}
