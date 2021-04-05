package io.swagger.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.PurOffer;

@Service
@Transactional
public class PurOfferServiceImpl implements PurOfferService {
	
	@Autowired
	private PurOfferRepository purOfferRepository;
	
	@Override
	public PurOffer addPurOffer(PurOffer purOffer) {
		return purOfferRepository.save(purOffer);
	}

	@Override
	public PurOffer deletePurOfferById(long id) {
		Optional<PurOffer> os = purOfferRepository.findById(id);
		if(os.isPresent()) purOfferRepository.deleteById(id);
		return os.get();
	}

	@Override
	public PurOffer updatePurOfferById(PurOffer purOffer, Long id) {
		Optional<PurOffer> os = purOfferRepository.findById(id);
		if(os.isPresent()) {
			purOfferRepository.updatePurOfferById(purOffer.getName(), purOffer.getDescription(), purOffer.getPhotoUrls(), purOffer.getId());
			return purOffer;
		} else return null;
	}

	@Override
	public List<PurOffer> findAllPurOffers() {
		return purOfferRepository.findAll();
	}

	@Override
	public PurOffer findPurOfferById(long id) {
		Optional<PurOffer> os = purOfferRepository.findById(id);
		if(os.isPresent()) return os.get();
		else return null;
	}

}
