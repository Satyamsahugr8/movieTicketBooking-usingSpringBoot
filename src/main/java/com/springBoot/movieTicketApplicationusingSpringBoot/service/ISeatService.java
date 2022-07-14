package com.springBoot.movieTicketApplicationusingSpringBoot.service;

import com.springBoot.movieTicketApplicationusingSpringBoot.Entity.Seat;

public interface ISeatService {
public Seat bookSeat(Seat seat);
public Seat cancelSeatBooking(Seat seat);
public Seat blockSeat(Seat seat); //not available for any booking 
}
