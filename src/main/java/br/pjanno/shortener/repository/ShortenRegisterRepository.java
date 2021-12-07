package br.pjanno.shortener.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.pjanno.shortener.model.ShortenRegister;

@Repository
public interface ShortenRegisterRepository extends JpaRepository<ShortenRegister, Long> {
	
	ShortenRegister findByShorten(String key);
	
	List<ShortenRegister> findByUrlContaining(String url);
	
}
