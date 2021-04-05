package io.swagger.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.PurOffer;

public interface PurOfferRepository extends JpaRepository<PurOffer, Long>  {
	@Modifying
	@Query("update PurOffer p set p.name = ?1, p.description = ?2, p.photoUrls = ?3 where p.id= ?4 ")
	void updatePurOfferById(String name, String description, String photoUrls, Long id);
}
