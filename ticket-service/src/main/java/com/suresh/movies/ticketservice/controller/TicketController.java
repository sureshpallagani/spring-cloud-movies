package com.suresh.movies.ticketservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.movies.ticketservice.Configuration;
import com.suresh.movies.ticketservice.repository.Booking;
import com.suresh.movies.ticketservice.repository.BookingRepository;

@RestController
public class TicketController {
	
	@Autowired
	private Configuration configuration;
	@Autowired
	private BookingRepository bookingRepository;
	
	@GetMapping("/showtimes")
	public Configuration getShowTimes() {
		return configuration;
	}
	
	@PostMapping("/bookings")
	public void createBooking(@RequestBody Booking booking) {
		
	}
	
	@GetMapping("/bookings/{id}")
	public Booking getBooking(@PathVariable int id) {
		Optional<Booking> booking = bookingRepository.findById(id);
		return booking.get();
	}
	
	@PutMapping("/bookings/{id}")
	public void updateBooking(@PathVariable int id) {
		
	}
	
	@DeleteMapping("/bookings/{id}")
	public void deleteBooking(@PathVariable int id) {
		
	}
}
