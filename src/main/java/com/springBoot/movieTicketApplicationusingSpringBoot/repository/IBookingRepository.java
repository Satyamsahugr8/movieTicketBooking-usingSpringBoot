package com.springBoot.movieTicketApplicationusingSpringBoot.repository;

import java.time.LocalDate;
import java.util.List;

import com.springBoot.movieTicketApplicationusingSpringBoot.Entity.Booking;
import com.springBoot.movieTicketApplicationusingSpringBoot.exception.BookingNotFoundException;



public interface IBookingRepository {
	public Booking addBooking(Booking booking);
	public Booking updateBooking(Booking booking) throws BookingNotFoundException;
	public Booking cancelBooking(int bookingid) throws BookingNotFoundException;
	public List<Booking> showAllBookings(int movieid);
	public List<Booking> showAllBookings(LocalDate bookingdate);
	public List<Booking> showBookingList(int showid);
	public double calculateTotalCost(int bookingid);
	
}
