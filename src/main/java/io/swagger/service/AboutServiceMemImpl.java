package io.swagger.service;

import io.swagger.model.About;

public class AboutServiceMemImpl implements AboutService {
	private static About ab = new About();

	@Override
	public About getAbout() {
		return ab;
	}

	@Override
	public About setAbout(About about) {
		ab.setContent(about.getContent());;
		return ab;
	}
}
