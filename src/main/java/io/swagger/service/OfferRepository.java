package io.swagger.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {
	@Modifying
	@Query("update Offer p set p.name = ?1, p.description = ?2, p.photoUrls = ?3 where p.id= ?4 ")
	void updateOfferById(String name, String description, String photoUrls, Long id);
}
