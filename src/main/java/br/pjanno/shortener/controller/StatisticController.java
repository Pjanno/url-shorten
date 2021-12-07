package br.pjanno.shortener.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pjanno.shortener.model.StatsLog;
import br.pjanno.shortener.service.StatisticService;

@RestController
public class StatisticController {
	
	@Autowired
	private StatisticService statsService;
	
	@GetMapping("/stats/{key}")
	@ResponseBody
	public List<StatsLog> accessStats(@PathVariable String key) {
		return statsService.accessOfUrl(key);
	}

}
