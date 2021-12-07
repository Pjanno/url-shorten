package br.pjanno.shortener.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ShortenRegister {

    @Id
    @GeneratedValue
    @Column(name = "CD_ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "URL", nullable = false, length = 2048)
    private String url;

    @Column(name = "URL_KEY", nullable = false)
    private String shorten;

    public ShortenRegister() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShorten() {
        return shorten;
    }

    public void setShorten(String shorten) {
        this.shorten = shorten;
    }
}
