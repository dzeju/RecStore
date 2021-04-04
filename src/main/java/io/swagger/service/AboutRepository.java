package io.swagger.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.About;

public interface AboutRepository extends JpaRepository<About,Long> {
	@Modifying
	@Query("update About s set s.content = ?1")
	void updateAbout(String content);
}
