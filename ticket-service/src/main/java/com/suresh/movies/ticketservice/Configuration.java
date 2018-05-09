package com.suresh.movies.ticketservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("showtimes")
public class Configuration {
	private String morning;
	private String matinee;
	private String evening;
	private String night;
	
	public String getMorning() {
		return morning;
	}
	public void setMorning(String morning) {
		this.morning = morning;
	}
	public String getMatinee() {
		return matinee;
	}
	public void setMatinee(String matinee) {
		this.matinee = matinee;
	}
	public String getEvening() {
		return evening;
	}
	public void setEvening(String evening) {
		this.evening = evening;
	}
	public String getNight() {
		return night;
	}
	public void setNight(String night) {
		this.night = night;
	}
	
}
