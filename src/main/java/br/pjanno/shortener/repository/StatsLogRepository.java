package br.pjanno.shortener.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pjanno.shortener.model.StatsLog;

public interface StatsLogRepository extends JpaRepository<StatsLog, Long>{

	List<StatsLog> findByShorten (String shortenKey);
	
}
