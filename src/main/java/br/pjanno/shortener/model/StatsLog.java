package br.pjanno.shortener.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StatsLog {
	
	@Id
	@GeneratedValue
	@Column(name = "CD_ID")
	private Long id;
	
	@Column(name = "GENERATED_LINK", nullable = false)
	private String shorten;
	
	@Column(name = "ACCESS_DATE", nullable = false)
	private Date accessDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShorten() {
		return shorten;
	}

	public void setShorten(String shorten) {
		this.shorten = shorten;
	}

	public Date getAccessDate() {
		return accessDate;
	}

	public void setAccessDate(Date accessDate) {
		this.accessDate = accessDate;
	}

	public StatsLog() {
		super();
	}

	public StatsLog(String shorten, Date accessDate) {
		super();
		this.shorten = shorten;
		this.accessDate = accessDate;
	}
	
	

}
