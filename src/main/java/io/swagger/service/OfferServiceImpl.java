package io.swagger.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.About;
import io.swagger.model.Offer;
import io.swagger.model.PurInfo;

@Service
@Transactional
public class OfferServiceImpl implements OfferService {
	
	@Autowired
	private OfferRepository offerRepository;
	
	@Autowired
	private PurInfoRepository purInfoRepository;

	@Override
	public Offer addOffer(Offer offer) {
		return offerRepository.save(offer);
	}

	@Override
	public Offer deleteOfferById(long id) {
		Optional<Offer> os = offerRepository.findById(id);
		if(os.isPresent()) offerRepository.deleteById(id);
		return os.get();
	}

	@Override
	public Offer updateOfferById(Offer offer, Long id) {
		Optional<Offer> os = offerRepository.findById(id);
		if(os.isPresent()) {
			offerRepository.updateOfferById(offer.getName(), offer.getDescription(), offer.getPhotoUrls(), offer.getId());
			return offer;
		} else return null;
	}

	@Override
	public List<Offer> findAllOffers() {
		return offerRepository.findAll();
	}

	@Override
	public Offer findOfferById(long id) {
		Optional<Offer> os = offerRepository.findById(id);
		if(os.isPresent()) return os.get();
		else return null;
	}

	@Override
	public PurInfo getPurInfo() {
		Optional<PurInfo> a = purInfoRepository.findById((long) 0);
		if(a.isPresent()) return a.get();
		else return null;
	}

	@Override
	public PurInfo setPurInfo(PurInfo purInfo) {
		return purInfoRepository.save(purInfo);
	}

}
