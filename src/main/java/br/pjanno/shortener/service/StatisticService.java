package br.pjanno.shortener.service;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.pjanno.shortener.model.StatsLog;
import br.pjanno.shortener.repository.StatsLogRepository;

@Service
public class StatisticService {
	
	@Autowired
	private StatsLogRepository statsRepo;

	public void registerAccess (String shortenKey) {
		StatsLog stats = new StatsLog(shortenKey, Date.from(Instant.now()));
		statsRepo.save(stats);
	}
	
	public List<StatsLog> accessOfUrl (String shortenKey) {
		List<StatsLog> stats = statsRepo.findByShorten(shortenKey);
		return stats;
	}
	
	
}
