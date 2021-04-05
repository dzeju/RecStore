package io.swagger.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.PurInfo;

public interface PurInfoRepository extends JpaRepository<PurInfo, Long> {
	@Modifying
	@Query("update PurInfo s set s.content = ?1 where s.id = 0")
	void updatePurInfo(String content);
}
