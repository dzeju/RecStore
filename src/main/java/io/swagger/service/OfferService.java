package io.swagger.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import io.swagger.model.About;
import io.swagger.model.Offer;
import io.swagger.model.PurInfo;

public interface OfferService {
	public Offer addOffer(Offer offer);
	public Offer deleteOfferById(long id);
	public Offer updateOfferById(Offer offer, Long id);
	public List<Offer> findAllOffers();
	@Cacheable ("offers")
	public Offer findOfferById(long id);
	
	public PurInfo getPurInfo();
	public PurInfo setPurInfo(PurInfo purInfo);
}
