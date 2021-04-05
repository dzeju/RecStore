package io.swagger.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import io.swagger.model.PurOffer;

public interface PurOfferService {
	public PurOffer addPurOffer(PurOffer purOffer);
	public PurOffer deletePurOfferById(long id);
	public PurOffer updatePurOfferById(PurOffer purOffer, Long id);
	public List<PurOffer> findAllPurOffers();
	@Cacheable ("puroffers")
	public PurOffer findPurOfferById(long id);
}
