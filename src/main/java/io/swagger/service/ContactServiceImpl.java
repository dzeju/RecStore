package io.swagger.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.swagger.model.Body;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

	@Override
	public Body sendContactForm(Body body) {
		System.out.print("\nCoś przyszło\n");
		System.out.print(body.getEmail());
		return null;
	}

}
