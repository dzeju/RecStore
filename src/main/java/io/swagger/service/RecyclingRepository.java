package io.swagger.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.Recycling;

public interface RecyclingRepository extends JpaRepository<Recycling,Long> {
	@Modifying
	@Query("update Recycling s set s.content = ?1")
	void updateRecycling(String content);
}
