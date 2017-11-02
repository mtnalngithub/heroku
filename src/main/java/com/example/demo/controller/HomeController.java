package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String homePage() {
		return "metin";
	}
	
	@RequestMapping("/FilmleriGetir")
	public List<Film> getFilmler() {
		List<Film> filmler = new ArrayList<>();
		filmler.add(new Film("Halk", "Korku", "2002", "8.1"));
		filmler.add(new Film("Prestij", "Bilim Kurgu", "2006", "8.8"));
		
		return filmler;
	}
}

class Film {
	
	private String filmAdi;
	private String Turu;
	private String yili;
	private String imdbPuani;
	
	public Film() {
		
	}
	
	public Film(String filmAdi, String turu, String yili, String imdbPuani) {
		this.filmAdi = filmAdi;
		Turu = turu;
		this.yili = yili;
		this.imdbPuani = imdbPuani;
	}

	public String getFilmAdi() {
		return filmAdi;
	}
	
	public void setFilmAdi(String filmAdi) {
		this.filmAdi = filmAdi;
	}
	
	public String getTuru() {
		return Turu;
	}
	
	public void setTuru(String turu) {
		Turu = turu;
	}
	
	public String getYili() {
		return yili;
	}
	
	public void setYili(String yili) {
		this.yili = yili;
	}
	
	public String getImdbPuani() {
		return imdbPuani;
	}
	
	public void setImdbPuani(String imdbPuani) {
		this.imdbPuani = imdbPuani;
	}
}